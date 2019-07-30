package net.yetamine.playground;

public class Chyby {
    public static void main(String... args) {
        try {
            fail();
        } catch (ArithmeticException e) {
            System.out.println("Hele, neco se stalo v aritmetice: "+e.getLocalizedMessage());
        } catch (Exception e) {
            System.out.println("Hele, neco se stalo: "+e.getLocalizedMessage());
        } finally {
            System.out.println("vzdy se vypise");
        }
    }

    private static void fail() {
        //((Object) null).toString();
        int i=1/0;
    }
}
