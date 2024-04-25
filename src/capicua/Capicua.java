/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package capicua;

import java.util.Scanner;

/**
 *
 * @author G513
 */
public class Capicua {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int casos, numero, largo;
        casos = sc.nextInt();
        int[] vectore;
        for (int i = 0; i < casos; i++) {
            try {
                numero = sc.nextInt();
                if (numero<0){
                    throw new java.lang.NegativeArraySizeException("El numero NO puede ser negativo");
                }
                largo = cantidadCifras(numero);
                vectore = new int[largo];
                vectore = descomponerNumero(numero);
                if (esCapicua(vectore) == true) {
                    System.out.println("CAPICUA");
                } else {
                    System.out.println("NO CAPICUA");
                }

            } catch (java.lang.NegativeArraySizeException ex1) {
                System.out.println("El numero NO puede ser negativo");
            }

        }
    }

    public static int cantidadCifras(int numero) {
        int longitude;
        if (numero == 0) {
            longitude = 1;
        } else {
            longitude = (int) (Math.log10(numero) + 1);
        }

        return longitude;
    }

    public static int[] descomponerNumero(int numero) {
        int largo, division;
        largo = cantidadCifras(numero);
        division = numero;
        int vector[] = new int[largo];

        for (int k = 0; k < largo; k++) {
            vector[k] = division % 10;
            division /= 10;
        }
        return vector;
    }

    public static boolean esCapicua(int[] numero) {
        boolean capicua = false;
        if (numero.length == 1) {
            capicua = true;
        } else {
            for (int l = 0; l < numero.length / 2; l++) {
                if (numero[l] == numero[numero.length - l - 1]) {
                    capicua = true;
                } else {
                    capicua = false;
                    return capicua;
                }
            }

        }
        return capicua;

    }

}
