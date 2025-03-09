package lattesite.elements;

public class HTMLListItemElement extends HTMLElement {

    public HTMLListItemElement(HTMLListElement parent) {
        this(parent, null);
    }

    public HTMLListItemElement(HTMLListElement parent, String text) {
        super(parent, "li", false);
        if (text != null) {
            this.setText(text);
        }
    }

}
