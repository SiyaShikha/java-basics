import models.Person;

public class SecondMain {
    public static void main(String[] args) {
        System.out.println("Hello Java");

//        Person[] people = {new Person("shikha", 21), new Person("rohini", 19), new Person("suman", 18)};
        Person<String, Integer> person = new Person<>("Shikha", 13);

        String[] strings = {"shikha", "rohini", "suman"};
        Integer[] numbers = {4,2,8,4,7};
        printAll(numbers);
        printAll(strings);
//        printAll(people);
    }

    private static <T> T echo(T element) {
        System.out.println(element);
        return element;
    }

    private static <T> void printAll(T[] elements) {
        for(T element: elements) {
            System.out.println(element.toString());
        }
    }
}
