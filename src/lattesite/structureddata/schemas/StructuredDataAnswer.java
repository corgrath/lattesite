package lattesite.structureddata.schemas;

public class StructuredDataAnswer {

    private final String text;

    public StructuredDataAnswer(
            String text
    ) {
        this.text = text;
    }

    public String getText() {
        return this.text;
    }

}
