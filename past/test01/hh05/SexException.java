package past.test01.hh05;

/**
 * @author GeekerHan
 * @create 2020 - 11 - 28 - 19:00
 */
public class SexException extends RuntimeException{
    public SexException() {
    }

    public SexException(String message) {
        super(message);
    }

    public SexException(String message, Throwable cause) {
        super(message, cause);
    }

    public SexException(Throwable cause) {
        super(cause);
    }

    public SexException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
