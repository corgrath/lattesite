package lattesite.html.elements;

public class HTMLInputElement extends HTMLElement {

    public HTMLInputElement(HTMLElement parent) {
        super(parent, "input", true);
    }

    public void setType(Type type) {
        this.setAttribute("type", type.getValue());
    }

    public void setPlaceholder(String placeholder) {
        this.setAttribute("placeholder", placeholder);
    }

    public void setMin(int min) {
        this.setAttribute("min", Integer.toString(min));
    }

    public void setMax(int max) {
        this.setAttribute("max", Integer.toString(max));
    }

    public void setValue(int value) {
        this.setValue(Integer.toString(value));
    }

    public void setValue(String value) {
        this.setAttribute("value", value);
    }

    public enum Type {

        TEXT("text"),
        EMAIL("email"),
        NUMBER("number"),
        RANGE("range");

        private final String value;

        Type(String value) {
            this.value = value;
        }

        public String getValue() {
            return this.value;
        }

    }

}
