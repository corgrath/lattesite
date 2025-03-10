package lattesite;

import lattesite.exceptions.LatteSiteException;
import lattesite.page.Page;
import lattesite.services.FileService;
import lattesite.services.SitemapService;
import lattesite.settings.SiteSettings;

import java.util.List;

public class LatteSite {

    private final SiteSettings siteSettings;
    private final FileService fileService;
    private final SitemapService sitemapService;

    public LatteSite(
            SiteSettings siteSettings,
            FileService fileService,
            SitemapService sitemapService
    ) {
        this.siteSettings = siteSettings;
        this.fileService = fileService;
        this.sitemapService = sitemapService;
    }

    public void generate(List<? extends Page> pages) throws LatteSiteException {

        // Clear the public folder
        this.fileService.deleteDirectory(siteSettings.getPublicFolder());

        // Copy over the static folder to the public
        this.fileService.copyDirectory(siteSettings.getStaticFolder(), siteSettings.getPublicFolder());

        // Generate the sitemap
        this.sitemapService.generateToDisk(pages, this.siteSettings.getPublicFolder() + "sitemap.xml");

    }

}
