package co.edu.uniquindio.estructuraDatos.recursividad;

public class DivideYVenceras {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6};
        int suma = sumarArreglo(array, 0, array.length - 1);
        System.out.println("la suma es " + suma);

    }

    public static int sumarArreglo(int[] array, int inicio, int fin) {
        if (inicio == fin) {
            return array[inicio];
        } else {
            int mitad = (inicio + fin) / 2;
            int sumaIzquierda = sumarArreglo(array, inicio, mitad);
            int sumaDerecha = sumarArreglo(array, mitad + 1, fin);
            return sumaDerecha + sumaIzquierda;
        }
    }

}
