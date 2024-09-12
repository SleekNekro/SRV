package EjerciciosAnonymousClasses;

abstract class Executable {
    abstract void executar();
}

class Executor {
    void executarXVegades(int x, Executable executable){
        for (int i = 0; i < x; i++) {
            executable.executar();
        }
    }
}

public class Ejer3 {
    public static void main(String[] args) {

        Executor executor = new Executor();

        executor.executarXVegades(10, new Executable() {
            @Override
            public void executar() {
                System.out.println("Hello World");
            }
        });
    }
}
