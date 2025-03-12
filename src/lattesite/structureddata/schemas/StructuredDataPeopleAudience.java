package lattesite.structureddata.schemas;

public class StructuredDataPeopleAudience {

    private final StructuredDataCountry geographicArea;
    private final String audienceType;
    private final String suggestedGender;

    public StructuredDataPeopleAudience(
            StructuredDataCountry geographicArea,
            String audienceType,
            String suggestedGender
    ) {
        this.geographicArea = geographicArea;
        this.audienceType = audienceType;
        this.suggestedGender = suggestedGender;
    }

    public StructuredDataCountry getGeographicArea() {
        return this.geographicArea;
    }

    public String getAudienceType() {
        return this.audienceType;
    }

    public String getSuggestedGender() {
        return this.suggestedGender;
    }

}
