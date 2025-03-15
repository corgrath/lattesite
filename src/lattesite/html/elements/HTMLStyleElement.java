package lattesite.html.elements;

public class HTMLStyleElement extends HTMLElement {

    public HTMLStyleElement(
            HTMLElement parent
    ) {
        this(parent, null);
    }

    public HTMLStyleElement(
            HTMLElement parent,
            String innerHTML
    ) {
        super(parent, "style", false, true);
        if (innerHTML != null) {
            this.setInnerHTML(innerHTML);
        }
    }

}
