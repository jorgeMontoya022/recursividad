package co.edu.uniquindio.estructuraDatos.recursividad;

/*
 * Implementa la multiplicación de dos números enteros
 * usando solo sumas y recursión.
 *
 * */

public class MultiplicacionPorSuma {
    public static void main(String[] args) {
        int n = 2;
        int cantMultiplicar = 5;
        int multiplicacion = multiplicarPorSumas(n, cantMultiplicar);
        System.out.println("la multiplicación es: " + multiplicacion);

    }

    public static int multiplicarPorSumas(int n, int cantMultiplicar) {
        if (cantMultiplicar == 0) {
            return 0;
        } else {
            return n + multiplicarPorSumas(n, cantMultiplicar - 1);
        }
    }
}
