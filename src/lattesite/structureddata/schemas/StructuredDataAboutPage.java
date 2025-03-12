package lattesite.structureddata.schemas;

public class StructuredDataAboutPage {

    private final String name;
    private final String url;
    private final StructuredDataOrganization organization;

    public StructuredDataAboutPage(
            String name,
            String url,
            StructuredDataOrganization organization
    ) {
        this.name = name;
        this.url = url;
        this.organization = organization;
    }

    public String getURL() {
        return this.url;
    }

    public String getName() {
        return this.name;
    }

    public StructuredDataOrganization getOrganization() {
        return this.organization;
    }

}
