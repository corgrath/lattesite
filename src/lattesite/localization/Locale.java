package lattesite.localization;

public class Locale {

    private final String code;

    /**
     * Create a new Locale.
     *
     * @param code - For example be "en" or "en-US", etc.
     */

    public Locale(String code) {
        this.code = code;
    }

    /**
     * Returns the locale code.
     *
     * @return - Returns the locale code.
     */
    public String getCode() {
        return this.code;
    }

    /**
     * Returns the code;
     *
     * @return - Returns the code.
     */
    @Override
    public String toString() {
        return this.code;
    }

}
