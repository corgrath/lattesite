package lattesite.html.elements;

public class HTMLLinkElement extends HTMLElement {

    /**
     * Creates a <link> element
     *
     * @param parent - Parent elent
     * @param rel    - Relationship
     * @param href   - Hyperlink
     */
    public HTMLLinkElement(
            HTMLElement parent,
            String rel,
            String href
    ) {
        this(parent, rel, href, null);
    }

    /**
     * Creates a <link> element
     *
     * @param parent - Parent elent
     * @param rel    - Relationship
     * @param href   - Hyperlink
     * @param type   - Type
     */
    public HTMLLinkElement(
            HTMLElement parent,
            String rel,
            String href,
            String type
    ) {
        super(parent, "link", true);
        super.setAttribute("rel", rel);
        super.setAttribute("href", href);
        if (type != null) {
            super.setAttribute("type", type);
        }
    }

}
