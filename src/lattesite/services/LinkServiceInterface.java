package lattesite.services;

import lattesite.localization.Locale;

public interface LinkServiceInterface {

    String addBaseURL(String pathWithSlashes);

    String addBaseURL(Locale locale, String pathWithSlashes);

    String addBaseURL(String baseURL, String pathWithSlashes);

    String addBaseURL(String baseURL, Locale locale, String pathWithSlashes);

    String createLocalizedURL(Locale locale, String pathWithSlashes);

}
