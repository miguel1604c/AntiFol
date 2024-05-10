package ordenandaoelarmario;

import java.util.Scanner;

public class OrdenandaoElArmario {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char ropa;

        int verano = 0;
        int invierno = 0;

        ropa = sc.next().charAt(0);
//condicional para que el programa deje de pedir datos
        while (ropa != '.') {
//  condicional para que pare con el primer armario y pase al siguiente
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
// parte en la cual verifica que tipo de prenda es
            if (verano > invierno) {
                System.out.println("VERANO");

            } else if (invierno > verano) {
                System.out.println("INVIERNO");
            } else {
                System.out.println("EMPATE");
            }
        }
    }

}
