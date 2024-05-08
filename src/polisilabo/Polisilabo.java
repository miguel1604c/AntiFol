package polisilabo;

import java.util.Scanner;

public class Polisilabo {
    /**
     * @
     * @param args 
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int casos;
        String palabra;
        String palabra2;
        String verbo;

        casos = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < casos; i++) {

            palabra = sc.next();
            verbo = sc.next();
            palabra2 = sc.next();

            if (palabra.equalsIgnoreCase(palabra2)) {
                System.out.println("TAUTOLOGIA");

            } else {
                System.out.println("NO TAUTOLOGIA");

            }

        }

    }
}
