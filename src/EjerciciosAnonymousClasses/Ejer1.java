package EjerciciosAnonymousClasses;

class Alumne extends Persona{}
class Persona implements colegio {}
interface colegio{}

public class Ejer1 {
    static void imprimirJerarquiaDeClasses(Class<?> c) {
        System.out.print(c.getName() + (c.getSuperclass() != null ? "  >  " : "\n"));
        if (c.getSuperclass() == null) return;
        imprimirJerarquiaDeClasses(c.getSuperclass());
    }
    public static void main(String[] args) {


        imprimirJerarquiaDeClasses(new colegio(){}.getClass());
    }
}