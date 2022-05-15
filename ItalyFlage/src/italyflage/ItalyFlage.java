/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package italyflage;

import java.awt.*;
import javax.swing.*;


/**
 *
 * @author dell
 */
public class ItalyFlage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame f = new JFrame ();
        f.setSize(500,400);
        
        Panel p1  = new Panel();
        f.add(p1);
        p1.setSize(400,400);
        p1.setBackground(Color.white);
        p1.setLayout(new BorderLayout());
        
        Panel p2 = new Panel();
        p1.add(p2,BorderLayout.EAST);
        p2.setPreferredSize(new Dimension(165,400));
        p2.setBackground(Color.green);
        
         Panel p3 = new Panel();
        p1.add(p3,BorderLayout.WEST);
        p3.setPreferredSize(new Dimension(165,400));
        p3.setBackground(Color.red);
        
         Panel p4 = new Panel();
        p1.add(p4,BorderLayout.CENTER);
        p4.setBackground(Color.white);
        f.pack();
         f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        f.setResizable(false);
        f.setVisible(true);
        
    }
    
}
