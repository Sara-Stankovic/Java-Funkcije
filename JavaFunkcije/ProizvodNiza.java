package JavaFunkcije;
//Omoguciti da korisnik unese n brojeva preko skenera i smestiti ih u niz.
//Napisati funkciju koja racuna proizvod elemenata zadatog niza.

import java.util.Scanner;

public class ProizvodNiza {

    public static int racunanje(int brojevi[]) {

        int proizvod = 1;
        for (int i = 0; i < brojevi.length; i++) {

            proizvod = proizvod * brojevi[i];
        }
        return proizvod;
    }



         public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Unesi duzinu niza: ");
        int[] brojevi = new int[sc.nextInt()];


        System.out.println("Unesi brojeve: ");


        for (int i = 0; i < brojevi.length; i++) {

            brojevi[i] = sc.nextInt();

            }
            System.out.println("Proizvod je: " + racunanje(brojevi));

        }




    }



