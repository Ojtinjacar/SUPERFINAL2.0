/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopoodefinitivo;

import javax.swing.JFrame;

/**
 *
 * @author oscar
 */
public class ProyectoPoodefinitivo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame Frame = new JFrame("Fifa20");
        Partido cotejo = new Partido();
        Frame.add(cotejo);
        
        Frame.setSize(1050, 730);
        Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Frame.setResizable(false);
        Frame.setLocationRelativeTo(null);
        Frame.setVisible(true);
        Frame.setLayout(null);
    }

}
