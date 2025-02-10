package co.edu.uniquindio.estructuraDatos.recursividad;

public class RecorrerMatriz {

    public static void main(String[] args) {
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        recorrerMatriz(matriz, 0, 0);
    }

    public static void recorrerMatriz(int[][] matriz, int i, int j) {
        if (i >= matriz.length) { // Si llegó al final de la matriz, termina
            return;
        }
        if (j >= matriz[i].length) { // Si llegó al final de la fila, pasa a la siguiente
            recorrerMatriz(matriz, i + 1, 0);
            return;
        }
        System.out.println("Elemento en [" + i + "][" + j + "]: " + matriz[i][j]);
        recorrerMatriz(matriz, i, j + 1); // Avanza a la siguiente columna
    }
}
