package EjerciciosLambda;

import java.util.List;

interface Filtre {
    boolean filtrar(int numero);
}


class MostradorDeNumeros {
    void mostrar(List<Integer> numeros, Filtre filtre) {
        for (var numero : numeros) {
            if (filtre.filtrar(numero)) {
                System.out.print(numero + " ");
            }
        }
        System.out.println();
    }
}


public class Ejer3 {
    public static void main(String[] args) {

        var numeros = List.of(2, 6, 4, 8, 1, 9, 3, 7, 5);

        new MostradorDeNumeros().mostrar(numeros, numero -> numero > 4);
        new MostradorDeNumeros().mostrar(numeros, numero -> numero%2==0);
        new MostradorDeNumeros().mostrar(numeros, numero -> numero%3==0);

    }
}