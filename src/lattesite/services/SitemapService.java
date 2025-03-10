package lattesite.services;

import lattesite.localization.Locale;
import lattesite.page.Page;
import lattesite.settings.SiteSettings;

import java.util.List;

public class SitemapService {

    private final SiteSettings siteSettings;
    private final LinkService linkService;
    private final String indentation;
    private final String nl;

    public SitemapService(SiteSettings siteSettings, LinkService linkService) {
        this(siteSettings, linkService, "    ", "\n");
    }

    public SitemapService(SiteSettings siteSettings, LinkService linkService, String indentation, String nl) {
        this.siteSettings = siteSettings;
        this.linkService = linkService;
        this.indentation = indentation;
        this.nl = nl;
    }

    public String generate(List<Page> pages) {

        String xml = "";

        xml += "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" + this.nl;
        xml += "<urlset xmlns=\"http://www.sitemaps.org/schemas/sitemap/0.9\" xmlns:xhtml=\"http://www.w3.org/1999/xhtml\">" + this.nl;

        for (Page page : pages) {
            if (page.isHidden()) {
                continue;
            }

            xml += this.indentation + "<url>\n";
            xml += this.indentation.repeat(2) + "<loc>" + this.linkService.addDomain(this.siteSettings.getBaseURL(), page.getPathWithSlashes()) + "</loc>" + this.nl;
            if (this.siteSettings.getLocales().size() >= 2) {
                for (Locale locale : this.siteSettings.getLocales()) {
                    xml += this.indentation.repeat(2) + "<xhtml:link rel=\"alternate\" hreflang=\"" + locale.getCode() + "\" href=\"" + this.linkService.addDomain(this.siteSettings.getBaseURL(), this.linkService.createLocalizedURL(locale, page.getPathWithSlashes())) + "\"/>" + this.nl;
                }
            }
            xml += this.indentation + "</url>" + this.nl;
        }

        xml += "</urlset>" + nl;

        return xml;

    }

}
