package lattesite.structureddata.schemas;

public class StructuredDataBreadcrumb {

    private final String name;
    private String item;

    public StructuredDataBreadcrumb(
            String name,
            String item
    ) {
        this.name = name;
        this.item = item;
    }

    public String getName() {
        return this.name;
    }

    public String getItem() {
        return this.item;
    }

    public void setItem(String item) {
        this.item = item;
    }

}
