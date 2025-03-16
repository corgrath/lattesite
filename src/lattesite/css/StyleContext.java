package lattesite.css;

import java.util.LinkedHashSet;
import java.util.Set;

public class StyleContext {

    private final Set<StyleBlock> blocks = new LinkedHashSet<>();

    public StyleBlock addClass(String className, OnCreation onCreation) {
        return this.addBlock("." + className, onCreation);
    }

    public StyleBlock addBlock(String className, OnCreation onCreation) {
        StyleBlock sc = new StyleBlock(className);

        onCreation.initialize(sc);

        this.blocks.add(sc);
        return sc;
    }

    public StyleBlock addSubBlock(StyleBlock parent, String className, OnCreation onCreation) {
        StyleBlock sc = new StyleBlock(parent.getClassName() + className);

        onCreation.initialize(sc);

        this.blocks.add(sc);
        return sc;
    }

    public StyleBlock addBlock(StyleBlock c) {
        this.blocks.add(c);
        return c;
    }

    public Set<StyleBlock> getBlocks() {
        return this.blocks;
    }

    public interface OnCreation {

        void initialize(StyleBlock sc);

    }
}
