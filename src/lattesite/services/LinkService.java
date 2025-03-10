package lattesite.services;

import lattesite.localization.Locale;
import lattesite.settings.SiteSettings;

public class LinkService {

    private final SiteSettings siteSettings;

    public LinkService(SiteSettings siteSettings) {
        this.siteSettings = siteSettings;
    }

    public String addDomain(String pathWithSlashes) {
        return addDomain(this.siteSettings.getBaseURL(), pathWithSlashes);
    }

    public String addDomain(String baseURL, String pathWithSlashes) {
        // Make sure that the base URL does not end with a forward slash
        if (baseURL.endsWith("/")) {
            baseURL = baseURL.substring(0, baseURL.length() - 1);
        }
        return baseURL + pathWithSlashes;
    }

    public String createLocalizedURL(Locale locale, String pathWithSlashes) {
        Locale primaryLocale = this.siteSettings.getLocales().get(0);
        if (locale.equals(primaryLocale)) {
            return pathWithSlashes;
        }
        return "/" + locale.getCode() + pathWithSlashes;
    }

}
