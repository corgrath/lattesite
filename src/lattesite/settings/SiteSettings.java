package lattesite.settings;

import lattesite.exceptions.LatteSiteException;
import lattesite.localization.Locale;

import java.util.List;

public abstract class SiteSettings {

    private final String baseURL;
    private final List<Locale> locales;

    public SiteSettings(
            String baseURL,
            List<Locale> locales
    ) throws LatteSiteException {
        this.baseURL = baseURL;
        this.locales = locales;

        if (locales.isEmpty()) {
            throw new LatteSiteException("List of locales cannot be empty. The site has to have at least one specified locale.");
        }
    }

    public String getBaseURL() {
        return this.baseURL;
    }

    public List<Locale> getLocales() {
        return this.locales;
    }

}
