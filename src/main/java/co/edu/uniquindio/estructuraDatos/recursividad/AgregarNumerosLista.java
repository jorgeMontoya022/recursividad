package co.edu.uniquindio.estructuraDatos.recursividad;

import java.util.ArrayList;

public class AgregarNumerosLista {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        int numero = 5;
        agregarNumerosLista(lista,numero);
    }

    public static void agregarNumerosLista(ArrayList<Integer> lista, int n) {
        if ( n == 0) {
            return;
        } else {
            lista.add(n);
            System.out.println(n);
            agregarNumerosLista(lista, n-1);
        }
    }
}
