package lattesite.structureddata.schemas;

public class StructuredDataArticle {

    private final String headline;
    private final String articleSection;
    private final String articleBody;
    private final String image;
    private final String description;
    private final String dateModified;
    private final String datePublished;
    private final String url;
    private final StructuredDataOrganization publisher;
    private final StructuredDataPeopleAudience audience;
    private final StructuredDataPerson author;
    private final StructuredDataPerson reviewer;

    public StructuredDataArticle(
            String headline,
            String articleSection,
            String articleBody,
            String image,
            String description,
            String dateModified,
            String datePublished,
            String url,
            StructuredDataOrganization publisher,
            StructuredDataPeopleAudience audience,
            StructuredDataPerson author
    ) {
        this.headline = headline;
        this.articleSection = articleSection;
        this.articleBody = articleBody;
        this.image = image;
        this.description = description;
        this.dateModified = dateModified;
        this.datePublished = datePublished;
        this.url = url;
        this.publisher = publisher;
        this.audience = audience;
        this.author = author;
        this.reviewer = null;
    }

    public String getHeadline() {
        return headline;
    }

    public String getArticleSection() {
        return articleSection;
    }

    public String getArticleBody() {
        return articleBody;
    }

    public String getImage() {
        return image;
    }

    public String getDescription() {
        return description;
    }

    public String getDateModified() {
        return dateModified;
    }

    public String getDatePublished() {
        return this.datePublished;
    }

    public String getURL() {
        return url;
    }

    public StructuredDataPerson getAuthor() {
        return author;
    }

    public StructuredDataPerson getReviewer() {
        return reviewer;
    }

    public StructuredDataPeopleAudience getAudience() {
        return this.audience;
    }

    public StructuredDataOrganization getPublisher() {
        return this.publisher;
    }
}
