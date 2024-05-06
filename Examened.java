package examened;

import java.util.Scanner;

public class Examened {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor1, valor2;
        int resultadoSuma, resultadoResta, resultadoProducto;
        double resultadoDivision;
        
        System.out.print("Introduzca un valor para el primer numero: ");
        valor1 = sc.nextInt();
        
        System.out.print("Introduzca un valor para el segundo numero: ");
        valor2 = sc.nextInt();
        
        // operaciones aritméticas básicas - se supone que no dividimos entre 0 (no 0 para valor2
        resultadoSuma = valor1 + valor2;
        resultadoResta = valor1 - valor2;
        resultadoProducto = valor1 * valor2;
        resultadoDivision = valor1 / valor2;
        
        /*  Visualización de los resultados de las operaciones aritméticas básicas para los valores introducidos, valor1 y valor2  */
        System.out.println("El resultado de la suma es: " + resultadoSuma);
        System.out.println("El resultado de la resta es: " + resultadoResta);
        System.out.println("El resultado de la multiplicación es: " + resultadoProducto);
        System.out.println("El resultado de la división es: " + resultadoDivision);
    }
    
}
