package co.edu.uniquindio.estructuraDatos.ejercicioPracticaJorge;

/**
 * Hacer una función recursiva que sume los primeros N números naturales.
 * Ejemplo: suma(4) = 4 + 3 + 2 + 1 = 10
 */

public class SumaPrimeroNumerosNaturales {
    public static void main(String[] args) {
        int n = 4;
        int resultado = sumarPrimerosN(n);
        System.out.println("La suma de los primeros numeros naturales de "+n+" es: "+resultado);

    }

    public static int sumarPrimerosN(int n) {
        return (n == 1) ? 1: sumarPrimerosN(n-1) + n;
    }
}
