package cinquecento;

import java.util.Scanner;

public class Cinquecento {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numAnyo;
        int anyo;
        int siglo;

        numAnyo = sc.nextInt();

        while (numAnyo != 0) {

            numAnyo--;

            anyo = sc.nextInt();

            siglo = (anyo - 1) / 100 + 1;

            System.out.println(siglo);

        }

    }

}
