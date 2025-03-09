package lattesite.elements;

public class HTMLAnchorElement extends HTMLElement {

    public HTMLAnchorElement(
            HTMLElement parent,
            String href,
            String title
    ) {
        super(parent, "a", false);
        this.setHref(href);
        this.setTitle(title);
    }

    public void setHref(String href) {
        this.setAttribute("href", href);
    }

    public void setRelationship(Relationship rel) {
        super.setAttribute("rel", rel.getValue());
    }

    public enum Relationship {
        NO_FOLLOW("nofollow");

        private final String value;

        Relationship(String value) {
            this.value = value;
        }

        public String getValue() {
            return this.value;
        }

    }

}
