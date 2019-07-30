package net.yetamine.playground;
import java.util.Scanner;

public class Prvocislo {
    public static void main(String[] args) {
        System.out.print("Test na prvocisla, zadej cislo: ");
        Scanner in = new Scanner(System.in);
        int cislo = in.nextInt();
        //int cislo = Integer.parseInt(System.console().readLine());
        System.out.println("Je "+cislo+" prvocislo?");
        System.out.println(jePrvocislo(cislo)?"Ano":"Ne");
    }

    public static boolean jePrvocislo(int i) {
        if (i < 3) {
            if (i==2) {
                //if i je 2 je prvo
                return true;
            }
            //if i je pod 1 tak neni
            return false;
        }

        if (i%2 == 0) {
            return false;
            //if i%2 neni
        } else {
            int n = 3;
            boolean b = true;
            while (n < i) {
                int mod = i % n;
                System.out.println(i + " mod " + n + " = " + mod);
                if (mod == 0) {
                    return false;
                }
                //skakat po 2 -> 3 5 7
                n = n + 2;
            }
            return true;
        }
    }

}
