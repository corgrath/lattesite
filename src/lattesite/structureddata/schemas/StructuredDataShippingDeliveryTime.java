package lattesite.structureddata.schemas;

public class StructuredDataShippingDeliveryTime {

    private final StructuredDataQuantitativeValue handlingTime;
    private final StructuredDataQuantitativeValue transitTime;

    public StructuredDataShippingDeliveryTime(
            StructuredDataQuantitativeValue handlingTime,
            StructuredDataQuantitativeValue transitTime
    ) {
        this.handlingTime = handlingTime;
        this.transitTime = transitTime;
    }

    public StructuredDataQuantitativeValue getHandlingTime() {
        return this.handlingTime;
    }

    public StructuredDataQuantitativeValue getTransitTime() {
        return this.transitTime;
    }

}
