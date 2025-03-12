package lattesite.structureddata.schemas;

public class StructuredDataQuestion {

    private final String name;
    private final StructuredDataAnswer acceptedAnswer;

    public StructuredDataQuestion(
            String name,
            StructuredDataAnswer acceptedAnswer
    ) {
        this.name = name;
        this.acceptedAnswer = acceptedAnswer;
    }

    public String getName() {
        return this.name;
    }

    public StructuredDataAnswer getAcceptedAnswer() {
        return this.acceptedAnswer;
    }

}
