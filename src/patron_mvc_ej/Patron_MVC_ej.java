/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package patron_mvc_ej;

import controlador.controlador;
import modelo.modelo;
import vista.vista;

/**
 *
 * @author jvargas
 */
public class Patron_MVC_ej {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        modelo modelo = new modelo();
        vista vista = new vista();
        controlador controlador = new controlador ( vista, modelo );
        
        controlador.iniciar_vista();
        
        vista.setVisible(true);
        
    }
    
}
