package lattesite.page;

import lattesite.css.StyleContext;
import lattesite.html.elements.HTMLBodyElement;
import lattesite.html.elements.HTMLHeadElement;
import lattesite.localization.Locale;

public interface Page {

    boolean isHidden();

    String getPathWithSlashes();

    void appendHeadElements(Locale locale, StyleContext styleContext, HTMLHeadElement parent) throws Exception;

    void appendBodyElements(Locale locale, StyleContext styleContext, HTMLBodyElement parent) throws Exception;

}
