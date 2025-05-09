import Bank.BankAccount;
import Exeptions.InsufficientBalanceException;
import MathLib.Operations;

public class Main {
    public static void main(String[] args) {
        //using imported package Library MathLib.Operations
        System.out.println(Operations.add(2, 4));

        Main.level1();

        exceptionStuff();
    }

    private static void exceptionStuff() {
        BankAccount bankAccount = new BankAccount(2000);
        try {
            bankAccount.withdraw(5000);
        } catch (InsufficientBalanceException e) {
            System.out.println(e);
        }
    }


    private static void level1() {
        Main.level2();
    }

    private static void level2() {
        try {
            Main.level3();
        } catch (Exception e) {
            StackTraceElement[] stackTrace = e.getStackTrace();
            for (StackTraceElement stackTraceElement : stackTrace) {
                System.out.println(stackTraceElement);
            }
        }
    }

    private static void level3() {
        int[] numbs = {1, 2, 3, 4};
        for (int i = 0; i < 10; i++) {
            System.out.println(numbs[i]);
        }
    }
}
