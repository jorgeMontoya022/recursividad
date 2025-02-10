package co.edu.uniquindio.estructuraDatos.ejercicioPracticaJorge;

public class SerieFibonacci {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 0; i < n; i++) {
            System.out.print(calcularFibonacci(i) + ",");
        }
    }

    private static int calcularFibonacci(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return calcularFibonacci(n - 1) + calcularFibonacci(n - 2);
        }
    }


}
