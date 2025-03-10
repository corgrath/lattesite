package lattesite.html.elements;

public class HTMLHeader3Element extends HTMLElement {

    public HTMLHeader3Element(HTMLElement parent, String text) {
        super(parent, "h3", false);
        this.setInnerHTML(text);
    }

}
