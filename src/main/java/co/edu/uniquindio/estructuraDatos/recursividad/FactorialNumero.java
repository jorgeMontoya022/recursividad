package co.edu.uniquindio.estructuraDatos.recursividad;

import java.util.Scanner;

public class FactorialNumero {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un número positivo: ");
        int numero = entrada.nextInt();
        entrada.close();

        if (numero < 0) {
            System.out.println("Por favor ingrese un número positivo");
        } else {
            int factorial = calcularFactorial(numero);
            System.out.println("El factorial de " + numero + " es: " + factorial);
        }
    }

    public static int calcularFactorial(int n) {
        return (n == 0 || n == 1) ? 1 : calcularFactorial(n-1) * n;
    }
}
