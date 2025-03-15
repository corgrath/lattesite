package lattesite.services;

import lattesite.css.StyleClass;

import java.util.Map;

public class StyleGeneratorService implements StyleGeneratorServiceInterface {

    private final String indentation;
    private final String spacing;
    private final String nl;

    public StyleGeneratorService() {
        this("    ", " ", "\n");
    }

    public StyleGeneratorService(String indentation, String spacing, String nl) {
        this.indentation = indentation;
        this.spacing = spacing;
        this.nl = nl;
    }

    public String toCSS(StyleClass sc) {

        String css = "." + sc.getClassName() + spacing + "{" + this.nl;

        for (Map.Entry<String, String> entry : sc.getStyles().entrySet()) {
            css += indentation + entry.getKey() + ":" + spacing + entry.getValue() + ";" + this.nl;
        }
        css += "}" + this.nl;

        return css;

    }

}
