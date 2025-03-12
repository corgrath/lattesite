package lattesite.structureddata.schemas;

public class StructuredDataMonetaryAmount {

    private final int value;
    private final String currency;

    public StructuredDataMonetaryAmount(
            int value,
            String currency
    ) {
        this.value = value;
        this.currency = currency;
    }

    public int getValue() {
        return this.value;
    }

    public String getCurrency() {
        return this.currency;
    }

}
