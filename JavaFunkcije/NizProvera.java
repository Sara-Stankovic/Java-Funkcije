package JavaFunkcije;

//Napisati funkciju koja proverava da li u nizu niski imena postoji "Marija" ili "Petar".

import java.util.Scanner;

public class NizProvera {

    public static boolean ime(String[] imena){
        for (int i = 0; i < imena.length; i++) {
            if (imena[i].equalsIgnoreCase("Marija") || imena[i].equalsIgnoreCase("Petar")){
                return true;
            }
        }

        return false;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Unesi duzinu niza: ");
        String[] imena = new String[sc.nextInt()];

        System.out.println("Unesi imena: ");

        for (int i = 0; i < imena.length; i++) {
            imena[i] = sc.next();
        }

        System.out.println(ime(imena));

    }

}
