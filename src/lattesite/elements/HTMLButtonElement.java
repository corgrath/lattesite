package lattesite.elements;

public class HTMLButtonElement extends HTMLElement {

    public HTMLButtonElement(
            HTMLElement parent,
            String id,
            String title
    ) {
        super(parent, "button", false);
        this.setID(id);
        this.setTitle(title);

        this.setAttribute("type", "button");
    }

}
