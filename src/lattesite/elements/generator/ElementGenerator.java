package lattesite.elements.generator;

import lattesite.elements.HTMLElement;
import lattesite.elements.HTMLRootElement;
import lattesite.exceptions.LatteSiteException;

import java.util.Map;

public class ElementGenerator {

    private final String indentation;
    private final String nl;

    public ElementGenerator() {
        this("    ", "\n");
    }

    public ElementGenerator(String indentation, String nl) {
        this.indentation = indentation;
        this.nl = nl;
    }

    public String generate(HTMLRootElement root) throws LatteSiteException {
        return render(0, root);
    }

    private String render(int level, HTMLElement element) throws LatteSiteException {

        String html = "";

        html += indentation.repeat(level) + "<" + element.getTagName() + this.nl;

        for (Map.Entry<String, String> item : element.getAttributes().entrySet()) {
            String name = item.getKey();
            String value = item.getValue();
            html += indentation.repeat(level + 1) + name + "=\"" + htmlEncode(value) + "\"" + this.nl;
        }

        if (!element.getStyles().isEmpty()) {
            String styleValue = "";
            for (Map.Entry<String, String> item : element.getStyles().entrySet()) {
                String name = item.getKey();
                String value = item.getValue();
                styleValue += name + ": " + htmlEncode(value) + "; ";
            }
            html += indentation.repeat(level + 1) + "style=\"" + styleValue.trim() + "\"";
        }

        html += indentation.repeat(level) + ">" + nl;

        if (element.getTextContents() != null) {
            html += indentation.repeat(level + 1) + htmlEncode(element.getTextContents().trim()) + nl;
        }

        if (element.getInnerHTML() != null) {
            html += indentation.repeat(level + 1) + element.getInnerHTML().trim() + nl;
        }

        for (HTMLElement child : element.getChildren()) {
            html += render(level + 1, child);
        }

        if (!element.isVoidElement()) {
            html += indentation.repeat(level);
            html += "</" + element.getTagName() + ">" + nl;
        }

        return html;

    }

    private String htmlEncode(String s) throws LatteSiteException {

        if (s == null) {
            throw new LatteSiteException("Cannot encode HTML as the given String value was null.");
        }

        s = s.replace("&", "&amp;");
        s = s.replace("\"", "&quot;");
        s = s.replace("<", "&lt;");
        s = s.replace(">", "&gt;");

        return s;
    }

}
