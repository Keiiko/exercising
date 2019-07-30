package net.yetamine.playground;

public class Hafak extends Animal implements Pojmenovano {
    public String jmeno() {
        return "Alik";
    }

    public void speak() {
        System.out.println("Haf");
    };
}
