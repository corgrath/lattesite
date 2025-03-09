package lattesite.elements;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class HTMLElement {

    private final String tagName;
    private final boolean voidElement;
    private final List<HTMLElement> children;

    private final Map<String, String> attributes;
    private final Map<String, String> styles;
    private String textContents;
    private String innerHTML;
//    private final List<String> classes;

    public HTMLElement(HTMLElement parent, String tagName, boolean voidElement) {
        this.tagName = tagName;
        this.voidElement = voidElement;
        this.children = new ArrayList<>();
        this.attributes = new HashMap<>();
        this.styles = new HashMap<>();
        this.textContents = null;
        this.innerHTML = null;
        if (parent != null) {
            parent.addChild(this);
        }
    }

    private void addChild(HTMLElement element) {
        if (this.voidElement) {
            throw new RuntimeException("Element \"" + this.tagName + "\" is specified as an Void element, hence cannot have children.");
        }
        this.children.add(element);
    }

    public List<HTMLElement> getChildren() {
        return children;
    }

    public void addClass(String s) {
        this.appendToProperty("class", s);
    }

    private void appendToProperty(String key, String s) {
        String value = this.attributes.get(key);
        if (value == null) {
            value = s;
        } else {
            value += " " + s;
        }
        this.attributes.put(key, value);
    }

    public void setInnerHTML(String innerHTML) {
        this.innerHTML = innerHTML;
    }

    public void setText(String textContents) {
        this.textContents = textContents;
    }

    public void addStyle(String key, String value) {
        this.styles.put(key, value);
    }

    public String getTagName() {
        return this.tagName;
    }

    public Map<String, String> getAttributes() {
        return this.attributes;
    }

    public Map<String, String> getStyles() {
        return this.styles;
    }

    public String getInnerHTML() {
        return this.innerHTML;
    }

    public String getTextContents() {
        return this.textContents;
    }

    public void setAttribute(String key, String value) {
        this.attributes.put(key, value);
    }

    public void setTitle(String title) {
        if (title != null && title.length() != 0) {
            this.setAttribute("title", title);
        }
    }

    public boolean isVoidElement() {
        return this.voidElement;
    }

    public void setID(String id) {
        this.setAttribute("id", id);
    }

    public void setAriaLabel(String label) {
        this.setAttribute("aria-label", label);
    }

    public String getID() {
        return this.getAttribute("id");
    }

    private String getAttribute(String key) {
        return this.attributes.get(key);
    }

}
