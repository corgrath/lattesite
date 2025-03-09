package lattesite.elements;

public class HTMLHeader2Element extends HTMLElement {

    public HTMLHeader2Element(HTMLElement parent, String text) {
        super(parent, "h2", false);
        this.setInnerHTML(text);
    }

}
