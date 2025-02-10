package co.edu.uniquindio.estructuraDatos.recursividad;

/**
 * Recorrer un array de forma recursiva
 */


public class ImprimirArreglo {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        recorrerArreglo(array, 0);

    }

    public static void recorrerArreglo(int[] array, int i) {
        if (i == array.length) {
            System.out.println("fin");

        } else {
            System.out.println(array[i]);
            recorrerArreglo(array, i+1);
        }
    }

}
