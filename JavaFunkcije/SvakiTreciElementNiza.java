package JavaFunkcije;

//Omoguciti da korisnik unese n brojeva preko skenera i smestiti ih u niz.
//Napraviti funkciju koja ispisuje svaki treci element niza u obrnutom redosledu.

import java.util.Scanner;

public class SvakiTreciElementNiza {


    public static void svakiTreci (int[] niz) {

        for (int i = niz.length - 1; i >= 0; i--) {
            if (i % 3 == 0)
                System.out.println(niz[i]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Unesi duzinu niza: ");
        int[] niz = new int[sc.nextInt()];

        System.out.println("Unesi brojeve: ");

        for (int i = 0; i < niz.length; i++) {

            niz[i] = sc.nextInt();
        }

        System.out.println("Dobijeni niz je: ");
        svakiTreci(niz);

    }

}