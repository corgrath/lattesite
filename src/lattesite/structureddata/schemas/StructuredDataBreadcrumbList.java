package lattesite.structureddata.schemas;

import java.util.ArrayList;
import java.util.List;

public class StructuredDataBreadcrumbList {

    private final String name;
    private final ArrayList<StructuredDataBreadcrumb> crumbs;

    public StructuredDataBreadcrumbList(
            String id
    ) {
        this.name = id;
        this.crumbs = new ArrayList<>();
    }

    public String getID() {
        return this.name;
    }

    public ArrayList<StructuredDataBreadcrumb> getBreadcrumbs() {
        return crumbs;
    }

    public void addBreadcrumbs(List<StructuredDataBreadcrumb> breadcrumbs) {
        this.crumbs.addAll(breadcrumbs);
    }

}
