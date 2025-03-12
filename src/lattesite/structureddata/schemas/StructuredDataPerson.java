package lattesite.structureddata.schemas;

public class StructuredDataPerson {

    private final String name;
    private final String description;
    private final String image;
    private final boolean female;
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
            boolean female,
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
        this.female = female;
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

    public boolean isFemale() {
        return this.female;
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
