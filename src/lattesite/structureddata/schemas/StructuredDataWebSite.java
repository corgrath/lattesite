package lattesite.structureddata.schemas;

public class StructuredDataWebSite {

    private final String name;
    private final String url;

    public StructuredDataWebSite(
            String name,
            String url
    ) {
        this.name = name;
        this.url = url;
    }

    public String getURL() {
        return this.url;
    }

    public String getName() {
        return this.name;
    }

}
