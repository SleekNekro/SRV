package EjerciciosLambda;

import java.util.Scanner;

public class Ejer2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("Dime la posición: ");
            int posicion = scanner.nextInt();

            Thread.ofVirtual().start(() -> {
                System.out.println("El número en la posicion " + posicion + " de la sucesión de fibonacci es: " + fibonacci(posicion));
            });
        }
    }

    static int fibonacci(int n){
        return n < 2 ? n : fibonacci(n - 1) + fibonacci(n - 2);
    }
}