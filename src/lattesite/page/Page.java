package lattesite.page;

import lattesite.html.elements.HTMLBodyElement;
import lattesite.html.elements.HTMLHeadElement;
import lattesite.localization.Locale;

public interface Page {

    boolean isHidden();

    String getPathWithSlashes();

    void appendHeadElements(Locale locale, HTMLHeadElement parent) throws Exception;

    void appendBodyElements(Locale locale, HTMLBodyElement parent) throws Exception;

}
