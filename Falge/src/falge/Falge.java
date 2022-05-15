/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package falge;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author dell
 */
public class Falge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int Heught = 500, Weight=500;
        Frame f = new Frame();
        f.setSize(Weight,Heught);
        f.setLocationRelativeTo(null);
        
         Panel  p1 = new Panel();
         p1.setLayout(new BorderLayout());
         p1.setPreferredSize(new Dimension(Weight,Heught));
        p1.setBackground(Color.red);
        
        Panel p2  = new Panel();
        p2.setPreferredSize(new Dimension(230,200));
        p2.setLayout(new FlowLayout());
        p2.setBackground(Color.white);
        p1.add(p2);
        
        Panel p3  = new Panel();
        p3.setPreferredSize(new Dimension(230,200));
        p3.setLayout(new FlowLayout());
        p3.setBackground(Color.white);
        p1.add(p3);
        
        Panel p4  = new Panel();
        p4.setPreferredSize(new Dimension(230,200));
        p4.setLayout(new FlowLayout());
        p4.setBackground(Color.white);
        p1.add(p4);
        
        Panel p5  = new Panel();
        p5.setPreferredSize(new Dimension(230,200));
        p5.setLayout(new FlowLayout());
        p5.setBackground(Color.white);
        p1.add(p5);
                f.add(p1,BorderLayout.CENTER);

        f.setVisible(true);
        
    }
    
}
