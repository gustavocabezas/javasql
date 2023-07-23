/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasql;

import javax.swing.JFrame;
import sql.ConnectionSQL;

/**
 *
 * @author Gustavo
 */
public class JavaSQL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
        ConnectionSQL frame = new ConnectionSQL();

        // Configurar el comportamiento cuando se cierra la ventana
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Mostrar la ventana (JFrame)
        frame.setVisible(true);
    }

}
