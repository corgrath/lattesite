package lattesite.elements;

public class HTMLParagraphElement extends HTMLElement {

    public HTMLParagraphElement(HTMLElement parent) {
        this(parent, null);
    }

    public HTMLParagraphElement(HTMLElement parent, String text) {
        super(parent, "p", false);
        if (text != null) {
            this.setText(text);
        }
    }

}
