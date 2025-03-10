package lattesite.html.elements;

public class HTMLRootElement extends HTMLElement {

    public HTMLRootElement() {
        this("root");
    }

    public HTMLRootElement(String tagName) {
        super(null, tagName, false);
    }

}

