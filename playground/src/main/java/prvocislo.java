package net.yetamine.playground;

public class prvocislo {
    public static void main(String[] args) {
        System.out.println("Je tohle prvocislo?");
        int i=20;
        int n=2;
        //if n je 2 je prvo
        //if n je pod 1 tak neni
        //if n%2 neni
        //skakat po 2 -> 3 5 7
        boolean b=true;
        while (n<i) {
            int mod=i%n;
            System.out.println(i+" mod "+n+" = "+mod);
            if (mod == 0) {
                b=false;
                break;
            }
            n++;
        }
        System.out.println(b);
    }
}
