package org.example;

import javax.swing.*;

public class Principal {
    private JFrame ventana;

    Principal() {
        ventana = new JFrame();
        ventana.setTitle("Primera ventana");
        ventana.setBounds(0, 0, 400, 400);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton b1, b2, b3;
        b1 = new JButton("Rojo");
        b2 = new JButton("Verde");
        b3 = new JButton("Azul");

        JPanel panel = new JPanel();

        panel.add(b1);
        panel.add(b2);
        panel.add(b3);

        ventana.getContentPane().add(panel);
    }

    public void mostrar(){
        ventana.setVisible(true);
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(()->new Principal().mostrar());

    }

}
