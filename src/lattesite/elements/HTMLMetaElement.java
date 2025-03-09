package lattesite.elements;

public class HTMLMetaElement extends HTMLElement {

    public HTMLMetaElement(
            HTMLElement parent,
            String name,
            String content
    ) {
        super(parent, "meta", true);
        this.setAttribute("name", name);
        this.setAttribute("content", content);
    }

}
