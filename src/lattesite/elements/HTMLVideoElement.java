package lattesite.elements;

public class HTMLVideoElement extends HTMLElement {

    public HTMLVideoElement(
            HTMLElement parent,
            String src,
            String alt,
            String title,
            int width,
            int height
    ) {
        super(parent, "video", false);
        this.setSource(src);
        this.setAriaLabel(alt);
        this.setTitle(title);
        this.setWidth(width);
        this.setHeight(height);
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

    public void setLoop(boolean loop) {
        if (loop) {
            this.setAttribute("loop", "");
        }
    }

    public HTMLVideoElement setControls(boolean controls) {
        if (controls) {
            this.setAttribute("controls", Boolean.toString(controls));
        }
        return this;
    }

    public void setPreload(boolean preload) {
        this.setAttribute("preload", preload ? "auto" : "none");
    }

    public void setMuted(boolean muted) {
        if (muted) {
            this.setAttribute("muted", "");
        }
    }

    public void setAutoPlay(boolean autoplay) {
        if (autoplay) {
            this.setAttribute("autoplay", "");
        }
    }

}
