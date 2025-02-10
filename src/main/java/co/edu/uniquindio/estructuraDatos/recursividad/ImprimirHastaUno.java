package co.edu.uniquindio.estructuraDatos.recursividad;

/**
 * Crea un método que imprima los dígitos desde N hasta 1.
 * Se debe pasar como parámetro el número N
 */

public class ImprimirHastaUno {
    public static void main(String[] args) {
        int n = 5;
        imprimirHasta1(n);
    }

    public static void imprimirHasta1(int n) {
        if (n == 0){
            System.out.println("fin");
        } else {
            System.out.println(n);
            imprimirHasta1(n-1);
        }
    }
}
