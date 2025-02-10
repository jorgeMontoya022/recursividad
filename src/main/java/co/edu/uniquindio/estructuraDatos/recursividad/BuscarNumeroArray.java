package co.edu.uniquindio.estructuraDatos.recursividad;

public class BuscarNumeroArray {

    public static void main(String[] args) {
        int numero = 3;
        int[] array = {1, 2, 3, 4, 5};
        buscarNumero(array, 0, numero);

    }

    public static void buscarNumero(int[] array, int i, int n) {
        if (n == array[i]) {
            System.out.println("el número " + n + " está en la posición " + i);
        }
        if (i == array.length - 1) {
            System.out.println("fin");
        } else {
            buscarNumero(array, i + 1, n);
        }
    }
}
