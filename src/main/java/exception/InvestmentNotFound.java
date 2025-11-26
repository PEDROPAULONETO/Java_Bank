package exception;

public class InvestmentNotFound extends RuntimeException {

    public InvestmentNotFound(String message) {
        super(message);
    }

}