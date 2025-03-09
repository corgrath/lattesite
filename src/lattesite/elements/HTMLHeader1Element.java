package lattesite.elements;

public class HTMLHeader1Element extends HTMLElement {

    public HTMLHeader1Element(HTMLElement parent, String text) {
        super(parent, "h1", false);
        this.setInnerHTML(text);
    }

}
