package lattesite.html.elements;

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

    @Override
    public final void setInnerHTML(String innerHTML) {
        super.setInnerHTML(innerHTML);
        super.setCodeBlock(true);
    }

    public void setSource(String src) {
        this.setAttribute("src", src);
    }

    public void setType(String type) {
        this.setAttribute("type", type);
    }

}
