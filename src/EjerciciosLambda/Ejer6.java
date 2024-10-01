package EjerciciosLambda;

import java.util.List;

public class Ejer6 {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(5,3,6,1,8,12,5);

        numeros.sort((a, b)-> a % 2== 0 ? 1 : b%2 == 0 ? 1 : -1);
    }
}
