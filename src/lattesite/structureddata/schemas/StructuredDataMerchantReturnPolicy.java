package lattesite.structureddata.schemas;

public class StructuredDataMerchantReturnPolicy {

    private final StructuredDataCountry applicableCountry;
    private final StructuredDataCountry returnPolicyCountry;
    private final String itemDefectReturnFees;
    private final String customerRemorseReturnFees;
    private final String returnFees;
    private final String refundType;
    private final String returnPolicyCategory;
    private final int merchantReturnDays;
    private final String returnMethod;
    private final String merchantReturnLink;

    public StructuredDataMerchantReturnPolicy(
            StructuredDataCountry applicableCountry,
            StructuredDataCountry returnPolicyCountry,
            String itemDefectReturnFees,
            String customerRemorseReturnFees,
            String returnFees,
            String refundType,
            String returnPolicyCategory,
            int merchantReturnDays,
            String returnMethod,
            String merchantReturnLink
    ) {
        this.applicableCountry = applicableCountry;
        this.returnPolicyCountry = returnPolicyCountry;
        this.itemDefectReturnFees = itemDefectReturnFees;
        this.customerRemorseReturnFees = customerRemorseReturnFees;
        this.returnFees = returnFees;
        this.refundType = refundType;
        this.returnPolicyCategory = returnPolicyCategory;
        this.merchantReturnDays = merchantReturnDays;
        this.returnMethod = returnMethod;
        this.merchantReturnLink = merchantReturnLink;
    }

    public StructuredDataCountry getApplicableCountry() {
        return this.applicableCountry;
    }

    public StructuredDataCountry getReturnPolicyCountry() {
        return this.returnPolicyCountry;
    }

    public String getItemDefectReturnFees() {
        return itemDefectReturnFees;
    }

    public String getCustomerRemorseReturnFees() {
        return customerRemorseReturnFees;
    }

    public String getReturnFees() {
        return returnFees;
    }

    public String getRefundType() {
        return refundType;
    }

    public String getReturnPolicyCategory() {
        return returnPolicyCategory;
    }

    public int getMerchantReturnDays() {
        return merchantReturnDays;
    }

    public String getReturnMethod() {
        return returnMethod;
    }

    public String getMerchantReturnLink() {
        return merchantReturnLink;
    }

}
