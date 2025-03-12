package lattesite.structureddata.schemas;

public class StructuredDataImageObject {

    private final String url;

    public StructuredDataImageObject(
            String url
    ) {
        this.url = url;
    }

    public String getURL() {
        return this.url;
    }

}
