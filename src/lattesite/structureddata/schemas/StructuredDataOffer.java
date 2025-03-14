package lattesite.structureddata.schemas;

import lattesite.structureddata.enumeration.ItemAvailability;
import lattesite.structureddata.enumeration.OfferItemCondition;

public class StructuredDataOffer {

    private final String url;
    private final String priceCurrency;
    private final int price;
    private final String priceValidUntil;
    private final ItemAvailability availability;
    private final OfferItemCondition itemCondition;
    private final StructuredDataOrganization seller;
    private final StructuredDataOfferShippingDetails shippingDetails;
    private final StructuredDataMerchantReturnPolicy hasMerchantReturnPolicy;

    public StructuredDataOffer(
            String url,
            String priceCurrency,
            int price,
            String priceValidUntil,
            ItemAvailability availability,
            OfferItemCondition itemCondition,
            StructuredDataOrganization seller,
            StructuredDataOfferShippingDetails shippingDetails,
            StructuredDataMerchantReturnPolicy hasMerchantReturnPolicy
    ) {
        this.url = url;
        this.priceCurrency = priceCurrency;
        this.price = price;
        this.priceValidUntil = priceValidUntil;
        this.availability = availability;
        this.itemCondition = itemCondition;
        this.seller = seller;
        this.shippingDetails = shippingDetails;
        this.hasMerchantReturnPolicy = hasMerchantReturnPolicy;
    }

    public String getURL() {
        return this.url;
    }

    public String getPriceCurrency() {
        return priceCurrency;
    }

    public int getPrice() {
        return price;
    }

    public String getPriceValidUntil() {
        return priceValidUntil;
    }

    public ItemAvailability getAvailability() {
        return availability;
    }

    public OfferItemCondition getItemCondition() {
        return itemCondition;
    }

    public StructuredDataOrganization getSeller() {
        return seller;
    }

    public StructuredDataOfferShippingDetails getShippingDetails() {
        return shippingDetails;
    }

    public StructuredDataMerchantReturnPolicy getHasMerchantReturnPolicy() {
        return this.hasMerchantReturnPolicy;
    }

}
