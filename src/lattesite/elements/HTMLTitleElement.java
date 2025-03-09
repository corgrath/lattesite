package lattesite.elements;

public class HTMLTitleElement extends HTMLElement {

    public HTMLTitleElement(
            HTMLElement parent,
            String title
    ) {
        super(parent, "title", false);
        this.setText(title);
    }

}
