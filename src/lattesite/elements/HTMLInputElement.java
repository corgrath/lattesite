package lattesite.elements;

public class HTMLInputElement extends HTMLElement {

    public HTMLInputElement(HTMLElement parent) {
        super(parent, "input", false);
    }

    public void setType(Type type) {
        this.setAttribute("type", type.getValue());
    }

    public void setPlaceholder(String placeholder) {
        this.setAttribute("placeholder", placeholder);
    }

    public enum Type {

        TEXT("text"),
        EMAIL("email");

        private final String value;

        Type(String value) {
            this.value = value;
        }

        public String getValue() {
            return this.value;
        }

    }

}
