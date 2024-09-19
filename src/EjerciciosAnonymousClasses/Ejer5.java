package EjerciciosAnonymousClasses;

public class Ejer5 {

    abstract class HolaMon {
        private String frase;

        public abstract void setFrase();

        public void saludar(){
            setFrase();
            System.out.println(frase);
        }
    }

    public void ferSalutacio() {


    }

    public static void main(String... args) {
        Ejer5 myApp = new Ejer5();
        myApp.ferSalutacio();
    }
}