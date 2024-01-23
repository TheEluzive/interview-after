package ecp2.exception;


public class WrongSideSizeException extends RuntimeException{
    public WrongSideSizeException() {
    }

    public WrongSideSizeException(String message) {
        super(message);
    }

    public WrongSideSizeException(String message, Throwable cause) {
        super(message, cause);
    }

    public WrongSideSizeException(Throwable cause) {
        super(cause);
    }

    public WrongSideSizeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}