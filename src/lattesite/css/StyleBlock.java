package lattesite.css;

import java.util.LinkedHashMap;
import java.util.Map;

public class StyleBlock {

    private final String className;
    private final Map<String, String> stylesDesktop;
    private final Map<String, String> stylesMobile;

    public StyleBlock(String className) {
        this.className = className;
        this.stylesDesktop = new LinkedHashMap<>();
        this.stylesMobile = new LinkedHashMap<>();
    }

    public StyleBlock addStyling(String key, int value) {
        return this.addStyling(key, Integer.toString(value));
    }

    public StyleBlock addStyling(String key, String value) {
        this.stylesDesktop.put(key, value);
        return this;
    }

    public StyleBlock addMobileStyling(String key, int value) {
        return this.addMobileStyling(key, Integer.toString(value));
    }

    public StyleBlock addMobileStyling(String key, String value) {
        this.stylesMobile.put(key, value);
        return this;
    }

    public String getClassName() {
        return this.className;
    }

    public Map<String, String> getStylesDesktop() {
        return this.stylesDesktop;
    }

    public Map<String, String> getMobileStyles() {
        return this.stylesMobile;
    }

    /*
     * Common styling
     */

    public StyleBlock setColor(String value) {
        return this.addStyling("color", value);
    }

    public StyleBlock setTextAlign(String value) {
        return this.addStyling("text-align", value);
    }

    public StyleBlock setTextDecoration(String value) {
        return this.addStyling("text-decoration", value);
    }

    public StyleBlock setFontSize(String value) {
        return this.addStyling("font-size", value);
    }

    public StyleBlock setBackgroundColor(String value) {
        return this.addStyling("background-color", value);
    }

}
