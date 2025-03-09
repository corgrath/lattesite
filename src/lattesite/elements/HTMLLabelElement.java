package lattesite.elements;

public class HTMLLabelElement extends HTMLElement {

    public HTMLLabelElement(HTMLElement parent, String forElementID, String text) {
        super(parent, "label", false);
        this.setAttribute("for", forElementID);
        if (text != null) {
            this.setText(text);
        }
    }

}
