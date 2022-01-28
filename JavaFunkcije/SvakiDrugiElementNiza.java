package JavaFunkcije;
//Omoguciti da korisnik unese n brojeva preko skenera i smestiti ih u niz.
//Napraviti funkciju koja ispisuje svaki drugi element zadatog niza.

import java.util.Scanner;

public class SvakiDrugiElementNiza {

    public static void svakiDrugi(int[] niz) {


        for (int i = 0; i < niz.length; i+=2) {
                System.out.println(niz[i]);
           }
        }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Uneti duzinu niza: ");
        int niz[] = new int[sc.nextInt()];

        System.out.println("Uneti brojeve: ");
        for (int i = 0; i < niz.length; i++) {
            int x = sc.nextInt();
            niz[i] = x;
        }
        System.out.println("Dobijeni niz je: ");
        svakiDrugi(niz);

    }

}