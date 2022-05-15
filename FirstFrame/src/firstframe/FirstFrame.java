/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstframe;

import javax.swing.JFrame;

/**
 *
 * @author dell
 */
public class FirstFrame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       JFrame f  = new JFrame();
       f.setSize(80,80);
       f.setLocationRelativeTo(f);
       f.setVisible(true);
    }
    
}
