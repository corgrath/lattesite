package lattesite.structureddata.schemas;

import java.util.List;

public class StructuredDataFAQPage {

    private final List<StructuredDataQuestion> mainEntity;

    public StructuredDataFAQPage(
            List<StructuredDataQuestion> mainEntity
    ) {
        this.mainEntity = mainEntity;
    }

    public List<StructuredDataQuestion> getMainEntity() {
        return this.mainEntity;
    }

}
