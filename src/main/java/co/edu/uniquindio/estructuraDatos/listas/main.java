package co.edu.uniquindio.estructuraDatos.listas;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class main {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("roberto");
        Empleado empleado2 = new Empleado("juar");
        Empleado empleado3 = new Empleado("rigoberto");
        Empleado empleado4 = new Empleado("Luis");

        List<Empleado> listaEmpleado = new ArrayList<>();
        listaEmpleado.add(empleado1);
        listaEmpleado.add(empleado2);
        listaEmpleado.add(empleado3);
        listaEmpleado.add(empleado4);

        ListIterator<Empleado>listIterator = listaEmpleado.listIterator();
        while (listIterator.hasNext()){
            Empleado empleado = listIterator.next();
            if (empleado.getNombre().startsWith("r")){
                listIterator.remove();
            }
        }
        System.out.println(listaEmpleado);
    }


}
