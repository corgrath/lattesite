package lattesite.css;

import java.util.LinkedHashMap;
import java.util.Map;

public class StyleClass {

    private final String indentation = "    ";
    private final String spacing = " ";
    private final String nl = "\n";

    private final String className;
    private final LinkedHashMap<String, String> styles;

    public StyleClass(String className) {
        this.className = className;
        this.styles = new LinkedHashMap<>();
    }

    public StyleClass addStyling(String key, String value) {
        this.styles.put(key, value);
        return this;
    }

    public String getClassName() {
        return this.className;
    }

    public Map<String, String> getStyles() {
        return this.styles;
    }

    public StyleClass createSubClass(String className) {
        return new StyleClass(this.getClassName() + className);
    }

    /*
     * Common styling
     */

    public StyleClass setColor(String value) {
        return this.addStyling("color", value);
    }

    public StyleClass setTextAlign(String value) {
        return this.addStyling("text-align", value);
    }

    public StyleClass setTextDecoration(String value) {
        return this.addStyling("text-decoration", value);
    }

    public StyleClass setFontSize(String value) {
        return this.addStyling("font-size", value);
    }

}
