package lattesite;

import lattesite.page.Page;
import lattesite.services.FileService;
import lattesite.services.PageGeneratorService;
import lattesite.services.SitemapService;
import lattesite.services.StaticWebServerServiceInterface;
import lattesite.settings.SiteSettings;

import java.util.List;

public class LatteSite {

    private final SiteSettings siteSettings;
    private final FileService fileService;
    private final PageGeneratorService pageGeneratorService;
    private final SitemapService sitemapService;
    private final StaticWebServerServiceInterface webServerService;

    public LatteSite(
            SiteSettings siteSettings,
            FileService fileService,
            PageGeneratorService pageGeneratorService,
            SitemapService sitemapService,
            StaticWebServerServiceInterface webServerService
    ) {
        this.siteSettings = siteSettings;
        this.fileService = fileService;
        this.pageGeneratorService = pageGeneratorService;
        this.sitemapService = sitemapService;
        this.webServerService = webServerService;
    }

    public void generate(List<? extends Page> pages) throws Exception {

        // Clear the public folder
        this.fileService.deleteDirectory(siteSettings.getPublicFolder());

        // Copy over the static folder to the public
        this.fileService.copyDirectory(siteSettings.getStaticFolder(), siteSettings.getPublicFolder());

        // Generate pages
        this.pageGeneratorService.generate(pages);

        // Generate the sitemap
        this.sitemapService.generateToDisk(pages, this.siteSettings.getPublicFolder() + "sitemap.xml");

    }

    /**
     * Starts a local static webserver on the given port.
     *
     * @param port - The port the server should bind to.
     */

    public void serve(int port) throws Exception {
        this.webServerService.serve(port);
    }

}
