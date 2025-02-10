package co.edu.uniquindio.estructuraDatos.recursividad;

import javax.swing.*;

public class matriusca {

    public static void main(String[] args) {
        int numeroMatriusca = 5;
        abrirMatriuscas(numeroMatriusca);
    }

    private static void abrirMatriuscas(int numeroMatriusca) {
        if (numeroMatriusca == 0) {
            return;
        }
        JOptionPane.showMessageDialog(null, "abriendo matriusca " + numeroMatriusca);
        abrirMatriuscas(numeroMatriusca - 1);
        JOptionPane.showMessageDialog(null, "cerrando matriusca " + numeroMatriusca);

    }
}
