package models;

public class Person<S, T> {
    public final S e1;
    private final T e2;

    public Person(S e1, T e2) {
        this.e1 = e1;
        this.e2 = e2;
    }

    @Override
    public String toString() {
        return "{ e1: " + this.e1 + ", e2: " + this.e2 + "}";
    }
}
