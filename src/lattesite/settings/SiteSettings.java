package lattesite.settings;

import lattesite.localization.Locale;
import lattesite.utils.StringUtil;

import java.util.List;

public class SiteSettings {

    private final String siteName;
    private final String baseURL;
    private final List<Locale> locales;
    private String publicFolder;
    private String staticFolder;
    private String brandColor;

    public SiteSettings(
            String siteName,
            String baseURL,
            Locale locale
    ) {
        this(siteName, baseURL, List.of(locale));
    }

    public SiteSettings(
            String siteName,
            String baseURL,
            List<Locale> locales
    ) {
        this.siteName = siteName;
        this.baseURL = baseURL;
        this.locales = locales;
        this.publicFolder = "public/";
        this.staticFolder = "static/";
        this.brandColor = null;
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

    public void setPublicFolder(String publicFolder) throws Exception {
        if (StringUtil.isEmpty(publicFolder)) {
            throw new Exception("Public folder cannot be empty.");
        }
        this.publicFolder = publicFolder;
    }

    public void setStaticFolder(String staticFolder) throws Exception {
        if (StringUtil.isEmpty(staticFolder)) {
            throw new Exception("Static folder cannot be empty.");
        }
        this.staticFolder = staticFolder;
    }

    public String getSiteName() {
        return this.siteName;
    }

    public void setBrandColor(String brandColor) {
        this.brandColor = brandColor;
    }

    public String getBrandColor() {
        return this.brandColor;
    }

}
