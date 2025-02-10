package co.edu.uniquindio.estructuraDatos.recursividad;

/**
 * Crea un método que imprima los dígitos desde 1 hasta N.
 * Se debe pasar como parámetro el número N
 */
public class ImprimirHastaN {

    public static void main(String[] args) {
        int n = 5;
        imprimirHastaN(n);

    }

    public static void imprimirHastaN(int n) {
        if(n == 0) {
            return;
        } else {
            imprimirHastaN(n-1);
            System.out.println(n);
        }
    }
}
