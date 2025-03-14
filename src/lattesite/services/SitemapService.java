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
    private final FileService fileService;
    private final LogService logService;

    public SitemapService(SiteSettings siteSettings, LogService logService, LinkService linkService, FileService fileService) {
        this(siteSettings, logService, linkService, fileService, "    ", "\n");
    }

    public SitemapService(SiteSettings siteSettings, LogService logService, LinkService linkService, FileService fileService, String indentation, String nl) {
        this.siteSettings = siteSettings;
        this.logService = logService;
        this.linkService = linkService;
        this.fileService = fileService;
        this.indentation = indentation;
        this.nl = nl;
    }

    public String generate(List<? extends Page> pages) throws Exception {

        this.logService.log("Generating sitemap for " + pages.size() + " pages.");

        List<Locale> locales = this.siteSettings.getLocales();

        if (locales == null) {
            throw new Exception("Cannot generate sitemap. List of locales in site settings is null.");
        }

        if (locales.isEmpty()) {
            throw new Exception("Cannot generate sitemap. At least one Locale needs to be specified in site settings.");
        }

        String xml = "";

        xml += "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" + this.nl;
        xml += "<urlset xmlns=\"http://www.sitemaps.org/schemas/sitemap/0.9\" xmlns:xhtml=\"http://www.w3.org/1999/xhtml\">" + this.nl;

        for (Page page : pages) {
            if (page.isHidden()) {
                continue;
            }

            xml += this.indentation + "<url>\n";
            xml += this.indentation.repeat(2) + "<loc>" + this.linkService.addBaseURL(this.siteSettings.getBaseURL(), page.getPathWithSlashes()) + "</loc>" + this.nl;
            if (locales.size() >= 2) {
                for (Locale locale : locales) {
                    xml += this.indentation.repeat(2) + "<xhtml:link rel=\"alternate\" hreflang=\"" + locale.getCode() + "\" href=\"" + this.linkService.addBaseURL(this.siteSettings.getBaseURL(), this.linkService.createLocalizedURL(locale, page.getPathWithSlashes())) + "\"/>" + this.nl;
                }
            }
            xml += this.indentation + "</url>" + this.nl;
        }

        xml += "</urlset>" + nl;

        return xml;

    }

    public void generateToDisk(List<? extends Page> pages, String file) throws Exception {
        this.logService.log("Will generating sitemap to \"" + file + "\".");
        String xml = this.generate(pages);
        this.fileService.writeFile(file, xml);
    }

}
