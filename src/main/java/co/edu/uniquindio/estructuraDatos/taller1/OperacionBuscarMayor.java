package co.edu.uniquindio.estructuraDatos.taller1;

public class OperacionBuscarMayor {

    public static int buscarMayor(int[]array, int elemento){
        int inicio = 0;
        int fin = array.length-1;
        return buscarMayor(array, inicio, fin, elemento);
    }

    private static int buscarMayor(int[] array, int inicio, int fin, int elemento) {
        if (inicio > fin) {
            return -1;

        } else {
            int mitad = (inicio + fin) / 2;
            if (elemento == array[mitad]) {
                return mitad;
            }
            if (elemento < array[mitad]) {
                return buscarMayor(array, inicio, mitad - 1, elemento);

            } else {
                return buscarMayor(array, mitad + 1, fin, elemento);

            }
        }
    }
}
