package org.example.ooo;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Pantalla extends JFrame {

    public Pantalla(){
        setTitle("Pantalla con evento de cierre");
        setBounds(0,0,300,400);

        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

        JButton b1,b2,b3;

        b1= new JButton("Rojo");
        b2= new JButton("Verde");
        b3= new JButton("Azul");

        JPanel panel;
        panel = new JPanel();

        panel.add(b1);
        panel.add(b2);
        panel.add(b3);

        getContentPane().add(panel);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public void mostrar(){
        this.setVisible(true);
    }


}
