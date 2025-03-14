package lattesite.structureddata.enumeration;

public enum GenderType {

    FEMALE("https://schema.org/Female"),
    MALE("https://schema.org/Male");

    private final String value;

    GenderType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    public String getValue() {
        return this.value;
    }

}
