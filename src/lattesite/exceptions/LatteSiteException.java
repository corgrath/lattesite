package lattesite.exceptions;

public class LatteSiteException extends Exception {

    public LatteSiteException(Throwable throwable) {
        this(throwable.getMessage());
    }

    public LatteSiteException(String message) {
        super(message);
    }

}
