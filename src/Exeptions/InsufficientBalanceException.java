package Exeptions;

public class InsufficientBalanceException extends Exception{
    public InsufficientBalanceException() {
        super("You have insufficient balance........");
    }

    @Override
    public String toString() {
        return "You have insufficient balance........";
    }
}
