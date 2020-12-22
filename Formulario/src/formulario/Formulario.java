/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulario;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 *
 * @author danie
 */
public class Formulario {

    public static void main(String[] args) 
    {
       Form Ventana = new Form();
       Ventana.setVisible(true);
       Ventana.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
}
