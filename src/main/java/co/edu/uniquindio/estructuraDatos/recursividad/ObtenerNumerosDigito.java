package co.edu.uniquindio.estructuraDatos.recursividad;

public class ObtenerNumerosDigito {
    public static void main(String[] args) {
        int n = 123;
        int cantidad = obtenerCantidadNumerosDigito(n);
        System.out.println("El número "+n+" tiene "+cantidad+" digitos");

    }
    public static int obtenerCantidadNumerosDigito(int n) {
        if (n < 10) {
            return 1;
        } else {
            return 1 + obtenerCantidadNumerosDigito(n/10);
        }
    }
}
