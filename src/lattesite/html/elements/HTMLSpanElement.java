package lattesite.html.elements;

public class HTMLSpanElement extends HTMLElement {

    public HTMLSpanElement(HTMLElement parent, String text) {
        super(parent, "span", false);
        if (text != null) {
            this.setText(text);
        }
    }

}
