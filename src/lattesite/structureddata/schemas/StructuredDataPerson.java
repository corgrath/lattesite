package lattesite.structureddata.schemas;

import lattesite.structureddata.enumeration.GenderType;

public class StructuredDataPerson {

    private final String name;
    private final String description;
    private final String image;
    private final GenderType gender;
    private final String url;
    private final String jobTitle;
    private final String knowsAbout;
    private final String[] sameAs;
    private final String givenName;
    private final String familyName;
    private final String knowsLanguage;

    public StructuredDataPerson(
            String name,
            String description,
            String image,
            GenderType gender,
            String url,
            String jobTitle,
            String knowsAbout,
            String[] sameAs,
            String givenName,
            String familyName
    ) {
        this.name = name;
        this.description = description;
        this.image = image;
        this.gender = gender;
        this.url = url;
        this.jobTitle = jobTitle;
        this.knowsAbout = knowsAbout;
        this.sameAs = sameAs;
        this.givenName = givenName;
        this.familyName = familyName;
        this.knowsLanguage = null;
    }

    public String getURL() {
        return this.url;
    }

    public String getImage() {
        return this.image;
    }

    public String getDescription() {
        return this.description;
    }

    public String getKnowsLanguage() {
        return this.knowsLanguage;
    }

    public String[] getSameAs() {
        return this.sameAs;
    }

    public String getKnowsAbout() {
        return this.knowsAbout;
    }

    public String getJobTitle() {
        return this.jobTitle;
    }

    public GenderType getGender() {
        return this.gender;
    }

    public String getGivenName() {
        return this.givenName;
    }

    public String getFamilyName() {
        return this.familyName;
    }

    public String getName() {
        return this.name;
    }
}
