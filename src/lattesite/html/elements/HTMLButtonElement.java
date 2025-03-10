package lattesite.html.elements;

public class HTMLButtonElement extends HTMLElement {

    public HTMLButtonElement(
            HTMLElement parent,
            String title
    ) {
        super(parent, "button", false);
        this.setTitle(title);

        this.setAttribute("type", "button");
    }

}
