package lattesite.settings;

import lattesite.exceptions.LatteSiteException;
import lattesite.localization.Locale;
import lattesite.utils.StringUtil;

import java.util.List;

public class SiteSettings {

    private final String baseURL;
    private final List<Locale> locales;
    private String publicFolder;
    private String staticFolder;

    public SiteSettings(
            String baseURL,
            List<Locale> locales
    ) {
        this.baseURL = baseURL;
        this.locales = locales;
        this.publicFolder = "public/";
        this.staticFolder = "static/";
    }

    public String getBaseURL() {
        return this.baseURL;
    }

    public List<Locale> getLocales() {
        return this.locales;
    }

    public String getPublicFolder() {
        return publicFolder;
    }

    public String getStaticFolder() {
        return this.staticFolder;
    }

    public void setPublicFolder(String publicFolder) throws LatteSiteException {
        if (StringUtil.isEmpty(publicFolder)) {
            throw new LatteSiteException("Public folder cannot be empty.");
        }
        this.publicFolder = publicFolder;
    }

    public void setStaticFolder(String staticFolder) throws LatteSiteException {
        if (StringUtil.isEmpty(staticFolder)) {
            throw new LatteSiteException("Static folder cannot be empty.");
        }
        this.staticFolder = staticFolder;
    }

}
