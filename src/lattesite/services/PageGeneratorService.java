package lattesite.services;

import lattesite.css.StyleBlock;
import lattesite.css.StyleContext;
import lattesite.html.elements.HTMLBodyElement;
import lattesite.html.elements.HTMLHeadElement;
import lattesite.html.elements.HTMLRootElement;
import lattesite.html.elements.HTMLStyleElement;
import lattesite.html.generator.ElementGenerator;
import lattesite.localization.Locale;
import lattesite.page.Page;
import lattesite.settings.SiteSettings;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class PageGeneratorService {

    private final SiteSettings settings;
    private final LogService logService;
    private final ElementGenerator elementGenerator;
    private final StyleGeneratorServiceInterface styleGeneratorService;
    private final LinkService linkService;
    private final FileService fileService;
    private String nl;

    public PageGeneratorService(
            SiteSettings settings,
            LogService logService,
            ElementGenerator elementGenerator,
            StyleGeneratorServiceInterface styleGeneratorService,
            LinkService linkService,
            FileService fileService
    ) {
        this.settings = settings;
        this.logService = logService;
        this.elementGenerator = elementGenerator;
        this.styleGeneratorService = styleGeneratorService;
        this.linkService = linkService;
        this.fileService = fileService;
        this.nl = "\n";
    }

    public void setNewLineCharacter(String nl) {
        this.nl = nl;
    }

    public void generate(List<? extends Page> pages) throws Exception {
        this.logService.log("Generating " + pages.size() + " pages over " + this.settings.getLocales().size() + " locales.");
        for (Locale locale : this.settings.getLocales()) {
            for (Page page : pages) {
                generate(locale, page);
            }
        }
    }

    public void generate(Locale locale, Page page) throws Exception {

        this.logService.log("Generating page " + page.getClass().getSimpleName() + " for locale " + locale + ".");

        String pageFolder = "public" + this.linkService.createLocalizedURL(locale, page.getPathWithSlashes());

        StyleContext styleContext = new StyleContext();

        HTMLRootElement htmlElement = new HTMLRootElement("html");
        htmlElement.setAttribute("lang", locale.getCode());

        HTMLHeadElement head = new HTMLHeadElement(htmlElement);

        page.appendHeadElements(locale, styleContext, head);

        HTMLBodyElement body = new HTMLBodyElement(htmlElement);

        page.appendBodyElements(locale, styleContext, body);

        // Add any styles that might have gotten added

        if (!styleContext.getBlocks().isEmpty()) {
            Set<String> styles = new LinkedHashSet<>();
            for (StyleBlock sc : styleContext.getBlocks()) {
                styles.add(this.styleGeneratorService.toCSS(sc));
            }
            String css = String.join("", styles);
            new HTMLStyleElement(head, css);
        }

        String html = "";
        html += "<!DOCTYPE html>" + this.nl;
        html += this.elementGenerator.generate(htmlElement);

        this.fileService.writeFile(pageFolder + "index.html", html);

    }

}