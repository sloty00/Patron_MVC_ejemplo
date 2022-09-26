/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.modelo;
import vista.vista;

/**
 *
 * @author jvargas
 */
public class controlador implements ActionListener {
    
    private vista vista;
    private modelo modelo;
    
    public controlador (vista vista, modelo modelo) {
        this.vista = vista;
        this.modelo = modelo;
        this.vista.cmdsumar.addActionListener(this);
    }
    
    public void iniciar_vista(){
        vista.setTitle("Demo MVC");
        vista.setLocationRelativeTo(null);
        vista.vtxt1.setText( String.valueOf(modelo.getValor1()) );
        vista.vtxt2.setText(String.valueOf(modelo.getValor2()));
        vista.vtxt3.setText(String.valueOf(modelo.getTotal()));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
