package lattesite.structureddata.enumeration;

public enum ItemAvailability {

    IN_STOCK("https://schema.org/InStock"),
    OUT_OF_STOCK("https://schema.org/OutOfStock");

    private final String value;

    ItemAvailability(String value) {
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
