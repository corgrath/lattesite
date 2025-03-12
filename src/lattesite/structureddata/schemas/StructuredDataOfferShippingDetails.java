package lattesite.structureddata.schemas;

public class StructuredDataOfferShippingDetails {

    private final StructuredDataMonetaryAmount shippingRate;
    private final StructuredDataDefinedRegion shippingDestination;
    private final StructuredDataShippingDeliveryTime deliveryTime;

    public StructuredDataOfferShippingDetails(
            StructuredDataMonetaryAmount shippingRate,
            StructuredDataDefinedRegion shippingDestination,
            StructuredDataShippingDeliveryTime deliveryTime
    ) {
        this.shippingRate = shippingRate;
        this.shippingDestination = shippingDestination;
        this.deliveryTime = deliveryTime;
    }

    public StructuredDataMonetaryAmount getShippingRate() {
        return this.shippingRate;
    }

    public StructuredDataDefinedRegion getShippingDestination() {
        return this.shippingDestination;
    }

    public StructuredDataShippingDeliveryTime getDeliveryTime() {
        return this.deliveryTime;
    }

}
