package lattesite.services;

import lattesite.exceptions.LatteSiteException;
import lattesite.html.elements.HTMLBodyElement;
import lattesite.html.elements.HTMLHeadElement;
import lattesite.html.elements.HTMLRootElement;
import lattesite.html.generator.ElementGenerator;
import lattesite.localization.Locale;
import lattesite.page.Page;
import lattesite.settings.SiteSettings;

import java.util.List;

public class PageGeneratorService {

    private final SiteSettings settings;
    private final LogService logService;
    private final ElementGenerator elementGenerator;
    private final LinkService linkService;
    private final FileService fileService;
    private String nl;

    public PageGeneratorService(
            SiteSettings settings,
            LogService logService,
            ElementGenerator elementGenerator,
            LinkService linkService,
            FileService fileService
    ) {
        this.settings = settings;
        this.logService = logService;
        this.elementGenerator = elementGenerator;
        this.linkService = linkService;
        this.fileService = fileService;
        this.nl = "\n";
    }

    public void setNewLineCharacter(String nl) {
        this.nl = nl;
    }

    public void generate(List<Page> pages) throws LatteSiteException {
        this.logService.log("Generating " + pages.size() + " pages over " + this.settings.getLocales().size() + " locales.");
        for (Locale locale : this.settings.getLocales()) {
            for (Page page : pages) {
                generate(locale, page);
            }
        }
    }

    public void generate(Locale locale, Page page) throws LatteSiteException {

        this.logService.log("Generating page " + page.getClass().getSimpleName() + " for locale " + locale + ".");

        HTMLRootElement htmlElement = new HTMLRootElement("html");
        htmlElement.setAttribute("lang", locale.getCode());

        HTMLHeadElement head = new HTMLHeadElement(htmlElement);

        page.appendHeadElements(locale, head);

        HTMLBodyElement body = new HTMLBodyElement(htmlElement);

        page.appendBodyElements(locale, body);

        String html = "";
        html += "<!DOCTYPE html>" + this.nl;
        html += this.elementGenerator.generate(htmlElement);

        String pageFolder = "public" + linkService.createLocalizedURL(locale, page.getPathWithSlashes());
        this.fileService.writeFile(pageFolder + "index.html", html);

    }

}