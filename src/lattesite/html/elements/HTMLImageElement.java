package lattesite.html.elements;

public class HTMLImageElement extends HTMLElement {

    public HTMLImageElement(
            HTMLElement parent,
            String src,
            String alt,
            String title,
            int width,
            int height
    ) {
        super(parent, "img", true);
        this.setSource(src);
        this.setAltText(alt);
        this.setTitle(title);
        this.setWidth(width);
        this.setHeight(height);
    }

    public void setAltText(String alt) {
        this.setAttribute("alt", alt);
    }

    public void setSource(String src) {
        this.setAttribute("src", src);
    }

    private void setHeight(int height) {
        this.setAttribute("height", Integer.toString(height));
    }

    private void setWidth(int width) {
        this.setAttribute("width", Integer.toString(width));
    }

    public HTMLImageElement setLoading(Loading loading) {
        this.setAttribute("loading", loading.toString());
        return this;
    }

    public enum Loading {
        LAZY("lazy"),
        EAGER("eager");

        private final String value;

        Loading(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }
    }
}
