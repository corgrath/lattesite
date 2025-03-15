package lattesite.css;

import java.util.LinkedHashSet;
import java.util.Set;

public class StyleContext {

    //    private final Set<String> styles = new LinkedHashSet<>();
    private final Set<StyleClass> classes = new LinkedHashSet<>();

//    public void addStyle(String css) {
//        css = css.trim();
//        this.styles.add(css);
//    }

//    public Set<String> getStyles() {
//        return Collections.unmodifiableSet(styles);
//    }
//
//    public boolean isEmpty() {
//        return this.styles.isEmpty();
//    }

    public StyleClass createClass(String className, OnCreation onCreation) {
        StyleClass sc = new StyleClass(className);

        onCreation.initialize(sc);

        this.classes.add(sc);
        return sc;
    }

    public StyleClass createSubClass(StyleClass parent, String className, OnCreation onCreation) {
        StyleClass sc = parent.createSubClass(className);

        onCreation.initialize(sc);

        this.classes.add(sc);
        return sc;
    }

    public StyleClass addClass(StyleClass c) {
        this.classes.add(c);
        return c;
    }

    public Set<StyleClass> getClasses() {
        return this.classes;
    }

    public interface OnCreation {

        void initialize(StyleClass sc);

    }
}
