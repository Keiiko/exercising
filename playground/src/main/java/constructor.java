package net.yetamine.playground;

public class constructor {
    int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public constructor(int value) {
        this.value = value;
    }

    public int incrementAndGet() {
        return ++value;
    }

    public static void main(String[] args){
        constructor oneTwo = new constructor(12);
        System.out.println(oneTwo.incrementAndGet());
        constructor two = new constructor(2);
        System.out.println(two.incrementAndGet());

        System.out.println(oneTwo.incrementAndGet());
        System.out.println(oneTwo.incrementAndGet());

        System.out.println(two.incrementAndGet());
        System.out.println(two.incrementAndGet());
    }
}
