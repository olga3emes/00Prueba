package org.example.ooo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ConsoleLog implements ActionListener {


    public void actionPerformed(ActionEvent e) {
        String mensaje;
        SimpleDateFormat fecha;
        fecha = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
        mensaje = fecha.format(new Date());
        mensaje +=  " click en el "; //mensaje = mensaje+ "click...

        if(e.getSource() instanceof JButton){
            mensaje +="botón ";
        }
        if(e.getSource() instanceof  JMenuItem){
            mensaje += "menú ";
        }
       AbstractButton botonPordefecto = (AbstractButton) e.getSource();
        mensaje += botonPordefecto.getText();

        System.out.println(mensaje);     
    }
}
