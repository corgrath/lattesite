package lattesite.services;

import lattesite.css.StyleBlock;

import java.util.Map;

public class StyleGeneratorService implements StyleGeneratorServiceInterface {

    private final int mobileBreakPoint;

    private final String indentation;
    private final String spacing;
    private final String nl;

    public StyleGeneratorService(int mobileBreakPoint) {
        this(mobileBreakPoint, "    ", " ", "\n");
    }

    public StyleGeneratorService(int mobileBreakPoint, String indentation, String spacing, String nl) {
        this.mobileBreakPoint = mobileBreakPoint;
        this.indentation = indentation;
        this.spacing = spacing;
        this.nl = nl;
    }

    public String toCSS(StyleBlock sc) {

        String css = sc.getClassName() + spacing + "{" + this.nl;
        for (Map.Entry<String, String> entry : sc.getStylesDesktop().entrySet()) {
            css += indentation + entry.getKey() + ":" + spacing + entry.getValue() + ";" + this.nl;
        }
        css += "}" + this.nl;

        if (!sc.getMobileStyles().isEmpty()) {
            css += "@media" + this.spacing + "(max-width:" + this.mobileBreakPoint + "px)" + this.spacing + "{" + this.nl;
            css += indentation.repeat(1) + sc.getClassName() + spacing + "{" + this.nl;
            for (Map.Entry<String, String> entry : sc.getMobileStyles().entrySet()) {
                css += indentation.repeat(2) + entry.getKey() + ":" + spacing + entry.getValue() + ";" + this.nl;
            }
            css += indentation.repeat(1) + "}" + this.nl;
            css += "}" + this.nl;
        }

        return css;

    }

}
