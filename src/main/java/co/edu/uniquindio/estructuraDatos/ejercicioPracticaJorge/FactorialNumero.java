package co.edu.uniquindio.estructuraDatos.ejercicioPracticaJorge;

/**
 * Escriba una función recursiva que calcule el
 * factorial de un número entero positivo.
 */

public class FactorialNumero {
    public static void main(String[] args) {
        int n = -2;

        if (n < 0) {
            System.out.println("Debe ser un número positivo");
        } else {
            int resultado = calcularFactorial(n);
            System.out.println("El factorial de "+n+" es: "+resultado);
        }

    }

    public static int calcularFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return calcularFactorial(n - 1) * n;
        }
    }
}
