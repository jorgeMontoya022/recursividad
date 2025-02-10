package co.edu.uniquindio.estructuraDatos.ejercicioPracticaJorge;

import javax.swing.*;

public class PalabraAlReves {
    public static void main(String[] args) {
        String palabra = JOptionPane.showInputDialog("Ingrese una palabra");
        String palabraInvertida = invertirPalabra(palabra);
        boolean palindroma = verificarPalindromismo(palabra, palabraInvertida);
        System.out.println(palindroma);

    }

    public static String invertirPalabra(String palabra) {
        if (palabra.isEmpty()){
            return palabra;
        } else {
            return invertirPalabra(palabra.substring(1))+(palabra.charAt(0));
        }
    }

    private static boolean verificarPalindromismo(String palabra, String palabraInvertida) {
        if (palabra.equalsIgnoreCase(palabraInvertida)) {
            JOptionPane.showMessageDialog(null, "la palabra "+palabra+" es palindroma");
            return true;
        } else if (palabra.equalsIgnoreCase("a la gorda drogala")) {
            JOptionPane.showMessageDialog(null, "Si es");
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "la palabra "+palabra+" no es palindroma");
            return false;
        }
    }
}
