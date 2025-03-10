package lattesite.html.elements;

public class HTMLTextAreaElement extends HTMLElement {

    public HTMLTextAreaElement(HTMLElement parent) {
        super(parent, "textarea", false);
    }

    public void setPlaceholder(String placeholder) {
        this.setAttribute("placeholder", placeholder);
    }

    public void setRows(int rows) {
        this.setAttribute("rows", Integer.toString(rows));
    }

}
