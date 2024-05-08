package ordenandaoelarmario;

import java.util.Scanner;

public class OrdenandaoElArmario {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char ropa;

        int verano = 0;
        int invierno = 0;

        ropa = sc.next().charAt(0);

        while (ropa != '.') {

            while (ropa != '.') {

                if (ropa == 'V') {
                    verano++;

                } else if (ropa == 'I') {
                    invierno++;
                } else {
                    verano++;
                    invierno++;
                }
                ropa = sc.next().charAt(0);
            }

            if (verano > invierno) {
                System.out.println("VERANO");

            } else if (invierno > verano) {
                System.out.println("INVIERNO");
            } else {
                System.out.println("EMPATE");
            }

            ropa = sc.next().charAt(0);

        }

    }

}
