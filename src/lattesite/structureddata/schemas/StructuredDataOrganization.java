package lattesite.structureddata.schemas;

public class StructuredDataOrganization implements StructuredDataSchema {

    private String type;
    private final String name;
    private final String url;
    private final StructuredDataImageObject logo;
    private final String description;
    private final String email;
    private final StructuredDataCountry areaServed;
    private final String knowsLanguage;
    private final String foundingDate;
    private final String[] isicV4Categories;
    private final String keywords;
    private final String knowsAbout;
    private final String vatID;
    private final String[] sameAs;
    private StructuredDataMerchantReturnPolicy hasMerchantReturnPolicy;
    private StructuredDataBrand brand;
    private StructuredDataBrand owns;

    public StructuredDataOrganization(
            String name,
            String url,
            StructuredDataImageObject logo,
            String description,
            String email,
            StructuredDataCountry areaServed,
            String knowsLanguage,
            String foundingDate,
            String[] isicV4Categories,
            String keywords,
            String knowsAbout,
            String vatID,
            String[] sameAs
    ) {
        this.type = "Organization";
        this.name = name;
        this.url = url;
        this.logo = logo;
        this.description = description;
        this.email = email;
        this.areaServed = areaServed;
        this.knowsLanguage = knowsLanguage;
        this.foundingDate = foundingDate;
        this.isicV4Categories = isicV4Categories;
        this.keywords = keywords;
        this.knowsAbout = knowsAbout;
        this.vatID = vatID;
        this.sameAs = sameAs;
        this.hasMerchantReturnPolicy = null;
        this.brand = null;
        this.owns = null;
    }

    public String getType() {
        return this.type;
    }

    public void setBrand(StructuredDataBrand brand) {
        this.brand = brand;
    }

    public void setOwns(StructuredDataBrand owns) {
        this.owns = owns;
    }

    public StructuredDataImageObject getLogo() {
        return this.logo;
    }

    public String getName() {
        return this.name;
    }

    public String getURL() {
        return this.url;
    }

    public String getEmail() {
        return this.email;
    }

    public String getDescription() {
        return this.description;
    }

    public StructuredDataCountry getAreaServed() {
        return this.areaServed;
    }

    public String getKnowsLanguage() {
        return this.knowsLanguage;
    }

    public String getFoundingDate() {
        return this.foundingDate;
    }

    public String[] getIsicV4Categories() {
        return this.isicV4Categories;
    }

    public StructuredDataBrand getBrand() {
        return this.brand;
    }

    public StructuredDataBrand getOwns() {
        return this.owns;
    }

    public String getKeywords() {
        return this.keywords;
    }

    public String getKnowsAbout() {
        return this.knowsAbout;
    }

    public String getVATID() {
        return this.vatID;
    }

    public String[] getSameAs() {
        return this.sameAs;
    }

    public StructuredDataMerchantReturnPolicy getHasMerchantReturnPolicy() {
        return this.hasMerchantReturnPolicy;
    }

    public void setHasMerchantReturnPolicy(StructuredDataMerchantReturnPolicy hasMerchantReturnPolicy) {
        this.hasMerchantReturnPolicy = hasMerchantReturnPolicy;
    }

    public void setType(String type) {
        this.type = type;
    }

}
