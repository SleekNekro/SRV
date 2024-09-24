package EjerciciosLambda;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejer1 extends JFrame {
    public static void main(String[] args) {
        new Ejer1().start();
    }

    public void start() {
        String test = "boton pulsado";
        JButton button1 = new JButton("Mega Button1");
        button1.addActionListener(e -> System.out.println("holaaa"));
        add(button1);

        ActionListener accion = e -> System.out.println("Boton pulsado"+ e.getActionCommand());
        JButton button2 = new JButton("Mega Button2");
        button2.addActionListener(accion);
        add(button2);

        JButton button3 = new JButton("Mega Button3");
        button3.addActionListener(accion);
        add(button3);

        setSize(600, 200);
        setLayout(new GridLayout(1, 3));
        setVisible(true);
    }
}
