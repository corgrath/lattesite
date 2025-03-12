package lattesite.structureddata.schemas;

import java.util.ArrayList;
import java.util.List;

public class StructuredDataProduct implements StructuredDataSchema {

    private final String name;
    private final String description;
    private final List<String> categories;
    private final List<String> imageURLs;
    private final String sku;
    private final String ean;
    //    private final Map<ProductProperty, ProductPropertyValue> properties;
    private final int price;
    private final boolean inStock;
    private final List<String> awards;
    private final StructuredDataOffer offers;
    private final StructuredDataPeopleAudience audience;
    private final StructuredDataBrand brand;
    private final List<StructuredDataPropertyValue> additionalProperties;

    public StructuredDataProduct(
            String name,
            String description,
            List<String> categories,
            List<String> imageURLs,
            String sku,
            String ean,
//            Map<ProductProperty, ProductPropertyValue> properties,
            int price,
            boolean inStock,
            List<String> awards,
            StructuredDataOffer offers,
            StructuredDataPeopleAudience audience,
            StructuredDataBrand brand
    ) {
        this.name = name;
        this.description = description;
        this.categories = categories;
        this.imageURLs = imageURLs;
        this.sku = sku;
        this.ean = ean;
//        this.properties = properties;
        this.price = price;
        this.inStock = inStock;
        this.awards = awards;
        this.offers = offers;
        this.audience = audience;
        this.brand = brand;
        this.additionalProperties = new ArrayList<>();
    }

    @Override
    public String getType() {
        return "Product";
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public List<String> getCategories() {
        return categories;
    }

    public List<String> getImageURLs() {
        return imageURLs;
    }

    public String getSku() {
        return sku;
    }

    public String getEan() {
        return ean;
    }

//    public Map<ProductProperty, ProductPropertyValue> getProperties() {
//        return properties;
//    }

    public int getPrice() {
        return price;
    }

    public boolean isInStock() {
        return inStock;
    }

    public StructuredDataBrand getBrand() {
        return this.brand;
    }

    public StructuredDataPeopleAudience getAudience() {
        return this.audience;
    }

    public List<String> getAwards() {
        return this.awards;
    }

    public StructuredDataOffer getOffers() {
        return this.offers;
    }

    public List<StructuredDataPropertyValue> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void addAdditionalProperty(StructuredDataPropertyValue structuredDataPropertyValue) {
        this.additionalProperties.add(structuredDataPropertyValue);
    }

}
