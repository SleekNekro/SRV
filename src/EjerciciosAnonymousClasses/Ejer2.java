package EjerciciosAnonymousClasses;
//Modifica el següent programa, per a que l'objecte notification siga d'una classe anònima que extenga la classe Notification,
//de forma que quan el paràmetre num siga major a 99,
//imprimisca You have +99 new messages, i quan el número siga 1, ho diga en singular.

class Notification {
    void show(int num) {
        if (num>99){
            System.out.println("You have "+"+99 messages");
        }else if (num==1){
            System.out.println("You have 1 new message");
        }else {
            System.out.println("You have " + num + " new messages");
        }
    }
}

public class Ejer2 {
    public static void main(String[] args) {

        new Notification(){}.show(1);
        new Notification(){}.show(100);
        new Notification(){}.show(52);
    }
}
