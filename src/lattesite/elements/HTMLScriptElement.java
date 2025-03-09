package lattesite.elements;

public class HTMLScriptElement extends HTMLElement {

    public HTMLScriptElement(
            HTMLElement parent
    ) {
        this(parent, null);
    }

    public HTMLScriptElement(
            HTMLElement parent,
            String src
    ) {
        super(parent, "script", false);
        if (src != null) {
            this.setSource(src);
        }
    }

    public void setSource(String src) {
        this.setAttribute("src", src);
    }

}
