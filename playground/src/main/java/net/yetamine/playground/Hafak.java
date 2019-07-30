package net.yetamine.playground;

public class Hafak extends Animal implements Pojmenovano {

    private final String jmeno;

    public Hafak(String jmeno) {
        this.jmeno = jmeno;
    }

    public Hafak() {
        this("Alik");
    }

    public String jmeno() {
        return this.jmeno;
    }

    public void speak() {
        System.out.println("Haf");
    };
}
