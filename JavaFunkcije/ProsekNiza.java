package JavaFunkcije;

//Napisati funkciju koja racuna prosecnu vrednost double[] niza.

import java.util.Scanner;

public class ProsekNiza {

    public static double prosek (double[] x) {
        double sum = 0;
        for (int i = 0; i < x.length; i++) {
            sum += x[i];
        }

        return sum / x.length;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        System.out.println("Unesi duzinu niza: ");
        double[] niz = new double[sc.nextInt()];

        System.out.println("Unesi brojeve: ");

        for (int i = 0; i < niz.length; i++) {
            niz[i] = sc.nextDouble();
        }

        System.out.println("Prosecna vrednost niza je: " + prosek(niz));

    }
}
