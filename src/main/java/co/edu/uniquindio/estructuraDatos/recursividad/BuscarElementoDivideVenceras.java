package co.edu.uniquindio.estructuraDatos.recursividad;

public class BuscarElementoDivideVenceras {
    public static void main(String[] args) {

        int[] array = {3, 7, 1, 9, 5, 2};
        int elemento = 7;

        int posicion = buscarPosicionElemento(array, 0, array.length - 1, elemento);

        if (posicion != -1) {
            System.out.println("Elemento encontrado en la posición: " + posicion);
        } else {
            System.out.println("Elemento no encontrado");
        }

    }

    public static int buscarPosicionElemento(int[] array, int inicio, int fin, int elemento) {
        if (inicio == fin) {
            if (array[inicio] == elemento) {
                return inicio;
            } else {
                return -1;  // Si no es el elemento buscado, retornamos -1
            }
        } else {
            int mitad = (inicio + fin) / 2;
            int izquierda = buscarPosicionElemento(array, inicio, mitad, elemento);
            int derecha = buscarPosicionElemento(array, mitad + 1, fin, elemento);

            if (izquierda != -1) {
                return izquierda;
            } else {
                return derecha;
            }
        }
    }
}
