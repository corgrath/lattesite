package lattesite.services;

import lattesite.localization.Locale;
import lattesite.settings.SiteSettings;

public class LinkService implements LinkServiceInterface {

    private final SiteSettings siteSettings;

    public LinkService(SiteSettings siteSettings) {
        this.siteSettings = siteSettings;
    }

    @Override
    public String addBaseURL(String pathWithSlashes) {
        return addBaseURL(this.siteSettings.getBaseURL(), pathWithSlashes);
    }

    @Override
    public String addBaseURL(Locale locale, String pathWithSlashes) {
        return addBaseURL(this.siteSettings.getBaseURL(), locale, pathWithSlashes);
    }

    @Override
    public String addBaseURL(String baseURL, String pathWithSlashes) {
        // Make sure that the base URL does not end with a forward slash
        if (baseURL.endsWith("/")) {
            baseURL = baseURL.substring(0, baseURL.length() - 1);
        }
        return baseURL + pathWithSlashes;
    }

    @Override
    public String addBaseURL(String baseURL, Locale locale, String pathWithSlashes) {
        // Make sure that the base URL does not end with a forward slash
        if (baseURL.endsWith("/")) {
            baseURL = baseURL.substring(0, baseURL.length() - 1);
        }
        return baseURL + createLocalizedURL(locale, pathWithSlashes);
    }

    @Override
    public String createLocalizedURL(Locale locale, String pathWithSlashes) {
        Locale primaryLocale = this.siteSettings.getLocales().get(0);
        if (locale.equals(primaryLocale)) {
            return pathWithSlashes;
        }
        return "/" + locale.getCode() + pathWithSlashes;
    }

}
