package co.edu.uniquindio.estructuraDatos.taller1;

import javax.swing.*;
import java.util.Arrays;

public class BuscarPosicionElemento {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        int elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el elemento que desea buscar en el vector"));
        int resultado = buscarPosicionElemento(array, elemento);
        if (resultado == -1) {
            JOptionPane.showMessageDialog(null,"El elemento "+elemento+" no está en el vector");
        } else {
            JOptionPane.showMessageDialog(null,"El elemento "+elemento+" está en la posición "+resultado);
        }

    }

    public static int buscarPosicionElemento(int[] array,  int elemento) {
       return OperacionBuscarMayor.buscarMayor(array,elemento);


    }

}
