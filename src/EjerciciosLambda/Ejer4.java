package EjerciciosLambda;

import java.util.List;

interface Filtro{
    boolean filtrar(Estudiantes estudiantes);
}
class Estudiantes{
    String nombre;
    int nota;

    public Estudiantes(String nombre, int edad) {
        this.nombre = nombre;
        this.nota = edad;
    }

    @Override
    public String toString() {
        return "Estudiantes{" +
                "nombre='" + nombre + '\'' +
                ", nota=" + nota +
                '}';
    }
}

class MostradorDeEstudiantes{
    void mostrar(List<Estudiantes> estudiantes, Filtro filtro){
        for (var es : estudiantes) {
            if (filtro.filtrar(es)) {
                System.out.print(es + " ");
            }
        }
        System.out.println();
    }
}

public class Ejer4 {
    public static void main(String[] args) {

        var estudiantes = List.of(new Estudiantes("AAA",4),new Estudiantes("BBB",6),
            new Estudiantes("CCC",10)
        );

        new MostradorDeEstudiantes().mostrar(estudiantes, estudiantes1 -> estudiantes1.nota >5);
        new MostradorDeEstudiantes().mostrar(estudiantes, estudiantes1 -> estudiantes1.nombre.contains("C"));
        new MostradorDeEstudiantes().mostrar(estudiantes, estudiantes1 -> estudiantes1.nombre.length() >5);
        new MostradorDeEstudiantes().mostrar(estudiantes, estudiantes1 -> true);
    }
}
