/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package new_frame;

import javax.swing.*;


/**
 *
 * @author dell
 */
public class New_frame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame f  = new JFrame ("wlc to our Frame");
        
        JPanel P = new JPanel();
        P.setLayout(null);
        JButton b = new JButton("press");
        b.setSize(150, 80);
        b.setLocation(160, 160);
        P.add(b);
        f.add(P);
        f.show();
        
    }
    
}
