package lattesite.structureddata.schemas;

public class StructuredDataWebPage {

    private final String name;
    private final String url;
    private final String description;
    private final StructuredDataWebSite isPartOf;

    public StructuredDataWebPage(
            String name,
            String url,
            String description,
            StructuredDataWebSite isPartOf
    ) {
        this.name = name;
        this.url = url;
        this.description = description;
        this.isPartOf = isPartOf;
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public String getURL() {
        return this.url;
    }

    public StructuredDataWebSite getIsPartOf() {
        return this.isPartOf;
    }
}
