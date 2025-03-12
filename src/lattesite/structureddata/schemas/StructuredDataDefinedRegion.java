package lattesite.structureddata.schemas;

public class StructuredDataDefinedRegion {

    private final String addressCountry;

    public StructuredDataDefinedRegion(
            String addressCountry
    ) {
        this.addressCountry = addressCountry;
    }

    public String getAddressCountry() {
        return this.addressCountry;
    }

}
