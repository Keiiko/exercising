package net.yetamine.playground;

public class TestBox {
    public static void main(String[] args) {
        final MiniBox<String> boxik = new MiniBox<>();
        System.out.println(boxik.getData());
        System.out.println(boxik);
        boxik.setData("Hello");
        System.out.println(boxik.getData());
        System.out.println(boxik);

        final MiniBox<String> jinyBoxik = new MiniBox<>();
        jinyBoxik.setData("Hello");
        System.out.println(jinyBoxik.getData());
        System.out.println(boxik.equals(jinyBoxik));
        System.out.println(jinyBoxik);
    }
}
