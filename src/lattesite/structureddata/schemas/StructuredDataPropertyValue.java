package lattesite.structureddata.schemas;

public class StructuredDataPropertyValue {

    private final String name;
    private final String value;

    public StructuredDataPropertyValue(
            String name,
            String value
    ) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return this.name;
    }

    public String getValue() {
        return this.value;
    }

}
