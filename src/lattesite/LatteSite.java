package lattesite;

import lattesite.exceptions.LatteSiteException;
import lattesite.page.Page;
import lattesite.services.FileService;
import lattesite.services.SitemapService;
import lattesite.services.StaticWebServerServiceInterface;
import lattesite.settings.SiteSettings;

import java.util.List;

public class LatteSite {

    private final SiteSettings siteSettings;
    private final FileService fileService;
    private final SitemapService sitemapService;
    private final StaticWebServerServiceInterface webServerService;

    public LatteSite(
            SiteSettings siteSettings,
            FileService fileService,
            SitemapService sitemapService,
            StaticWebServerServiceInterface webServerService
    ) {
        this.siteSettings = siteSettings;
        this.fileService = fileService;
        this.sitemapService = sitemapService;
        this.webServerService = webServerService;
    }

    public void generate(List<? extends Page> pages) throws LatteSiteException {

        // Clear the public folder
        this.fileService.deleteDirectory(siteSettings.getPublicFolder());

        // Copy over the static folder to the public
        this.fileService.copyDirectory(siteSettings.getStaticFolder(), siteSettings.getPublicFolder());

        // Generate the sitemap
        this.sitemapService.generateToDisk(pages, this.siteSettings.getPublicFolder() + "sitemap.xml");

    }

    public void serve(int port) throws LatteSiteException {
        this.webServerService.serve(port);
    }

}
