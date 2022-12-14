package alan.daniel.gabriel.batalhanaval.exeption;

public class NumeroErrado extends RuntimeException{
    public NumeroErrado() {
    }

    public NumeroErrado(String message) {
        super(message);
    }

    public NumeroErrado(String message, Throwable cause) {
        super(message, cause);
    }

    public NumeroErrado(Throwable cause) {
        super(cause);
    }

    public NumeroErrado(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
