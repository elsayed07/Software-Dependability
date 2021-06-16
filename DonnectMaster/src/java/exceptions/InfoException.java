package exceptions;

/**
 *
 * @author Mohammad
 */
public class InfoException extends Exception {

    public InfoException() {
        super();
    }

    public InfoException(String message) {
        super(message);
    }

    public InfoException(String message, Throwable cause) {
        super(message, cause);
    }

    public InfoException(Throwable cause) {
        super(cause);
    }

    public InfoException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
