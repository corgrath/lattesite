package lattesite.structureddata.enumeration;

public enum OfferItemCondition {

    NEW("https://schema.org/NewCondition"),
    USED("https://schema.org/UsedCondition");

    private final String value;

    OfferItemCondition(String value) {
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
