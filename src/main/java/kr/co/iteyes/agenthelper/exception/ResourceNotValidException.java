package kr.co.iteyes.agenthelper.exception;

public class ResourceNotValidException extends RuntimeException {
    public ResourceNotValidException(String message) {
        super(message);
    }

    public ResourceNotValidException(String message, Throwable cause) {
        super(message, cause);
    }

    public ResourceNotValidException(Throwable cause) {
        super(cause);
    }

    protected ResourceNotValidException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
