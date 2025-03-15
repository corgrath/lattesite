package lattesite.html.component;

import lattesite.css.StyleContext;
import lattesite.html.elements.HTMLElement;

/**
 * Abstract concept of a Component.
 */

public abstract class Component {

    /**
     * Creates a new component
     *
     * @param styleContext Used to add CSS styling.
     * @param parent       The parent HTML element.
     */

    public Component(StyleContext styleContext, HTMLElement parent) {
    }

}
