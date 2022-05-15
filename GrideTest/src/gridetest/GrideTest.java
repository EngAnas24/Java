/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gridetest;

import java.awt.Color;
import java.awt.Frame;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Panel;

/**
 *
 * @author dell
 */
public class GrideTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Frame f = new Frame ();
        f.setLayout(new GridLayout(2,3,8,8));
        f.setSize(500,500);
        f.setBackground(Color.BLACK);
        
         
        Panel p1 = new Panel();
        p1.setBackground(Color.BLUE);
                f.add(p1);

        
        Panel p2 = new Panel();
        p2.setBackground(Color.yellow);
                f.add(p2);

       Panel p3 = new Panel();
        p3.setBackground(Color.white);
                f.add(p3);
                
                 Panel p4 = new Panel();
        p4.setBackground(Color.red);
                f.add(p4);

                Panel p5 = new Panel();
        p5.setBackground(Color.green);
                f.add(p5);

        
                Panel p6 = new Panel();
        p6.setBackground(Color.ORANGE);
                f.add(p6);

        f.setVisible(true);
    }
    
}
