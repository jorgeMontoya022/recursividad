package co.edu.uniquindio.estructuraDatos.recursividad;

import java.util.Scanner;

/**
 * Sumar los números naturales hasta N (Hay que ingresarlo) de forma recursiva.
 */

public class SumasHastaN {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el número: ");
        int n = entrada.nextInt();

        int suma = sumarHastaN(n);
        System.out.println("la suma es: " + suma);

    }

    public static int sumarHastaN(int n) {
        return n == 0 ? 0 : n + sumarHastaN(n-1);
    }

}
