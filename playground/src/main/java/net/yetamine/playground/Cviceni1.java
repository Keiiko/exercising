package net.yetamine.playground;

//testovani
import java.util.Arrays;
import java.util.Scanner;

public class Cviceni1 {
    public static void main(String[] args){
        System.out.print("Test na prvocisla, zadej koncove cislo: ");
        try (Scanner in = new Scanner(System.in)) {
            int cislo = in.nextInt();
            vypisPrvocislaAzPo(cislo);
        } finally {
            System.out.println(" Done");
        }
    }

    private static void vypisPrvocislaAzPo(int cislo) {
        // TODO vypis konkretni cisla,
        int[] t = seznamPrvocisel(cislo);
        System.out.print(Arrays.toString(t));
    }

    private static int[] seznamPrvocisel(int maxIn) {
        int prvocisla=0;
        boolean[] t = new boolean[maxIn + 1];
//            t[0]=true;
//            t[1]=true;
        for (int i=2; i<=maxIn; i++) {
            if (!t[i]) {
                ++prvocisla;
                for (int j = i*2; j<=maxIn; j += i) {
                    t[j]=true;
                }
            }
        }
        int[] arr = new int[prvocisla];
        int prvocislaIxd = 0;
        for (int i=2; i<maxIn; i++) {
            if (!t[i]) {
                arr[prvocislaIxd] = i;
                ++prvocislaIxd;
            }
        }
        return arr;
    }


}
