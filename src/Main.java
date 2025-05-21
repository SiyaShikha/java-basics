import Bank.BankAccount;
import Exeptions.InsufficientBalanceException;
import MathLib.Operations;
import models.Person;
import network.HttpResponseCode;

public class Main {
    public static void main(String[] args) {
//        importedPackageStuff();
//        exceptionStuff();
//        genericsStuff();
//        enumStuff();
    }

    private static void enumStuff() {
        HttpResponseCode ok = HttpResponseCode.OK;
        HttpResponseCode error = HttpResponseCode.ERROR;
        int okCode = ok.getCode();
        String okMsg = ok.getMsg();
        int errorCode = error.getCode();
        String errorMsg = error.getMsg();
        System.out.println(okCode);
        System.out.println(errorCode);
        System.out.println(okMsg);
        System.out.println(errorMsg);
    }

    private static void genericsStuff() {
        String[] strings = {"shikha", "rohini", "suman"};
        Integer[] numbers = {1, 2, 3, 4};
        Person[] people = {new Person("Shikha", 21), new Person("Rohini", 19)};

        printAll(numbers);
        printAll(strings);
        printAll(people);

        System.out.println("============ before echo ============");
        String s = echo("Hello Java");
        Integer i = echo(2);
        System.out.println("============ after echo ============");
        System.out.println(s);
        System.out.println(i);
    }

    private static <T> T echo(T element) {
        System.out.println(element);
        return element;
    }

    private static <T> void printAll(T[] elements) {
        for (T element : elements) {
            System.out.println(element.toString());
        }
    }

    private static void importedPackageStuff() {
        int a = 2;
        int b = 3;
        System.out.printf("%d + %d = %d", a, b, Operations.add(a, b));
    }

    private static void exceptionStuff() {
        Main.level1();

        BankAccount bankAccount = new BankAccount(2000); //custom exception class

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
