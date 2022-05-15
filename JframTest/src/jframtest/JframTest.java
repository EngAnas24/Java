/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jframtest;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Panel;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author dell
 */
public class JframTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int weidth = 500;
        int height = 500;
        JFrame frame = new JFrame();
        frame.setSize(weidth, height+15);
        frame.setBackground(Color.white);
                 frame.setLayout(new BorderLayout());

        
        Panel p1 = new Panel();
        p1.setBackground(Color.RED);
        p1.setPreferredSize(new Dimension(weidth, height/3));
         frame.getContentPane().add(p1,BorderLayout.NORTH);
         
          Panel p2 = new Panel();
        p2.setPreferredSize(new Dimension(weidth, height/3));
         frame.getContentPane().add(p2,BorderLayout.SOUTH);
                p2.setBackground(Color.BLACK);
 
       Panel p3 = new Panel();
       p3.setPreferredSize(new Dimension(100,100));
       p3.setBackground(Color.yellow);
      p1.setLayout(new FlowLayout(FlowLayout.RIGHT,3,3));
      p1.add(p3);
              Panel p4 = new Panel();
 p4.setPreferredSize(new Dimension(100,100));
       p4.setBackground(Color.yellow);
      p1.setLayout(new FlowLayout(FlowLayout.RIGHT,3,3));
      p1.add(p4);
        frame.setVisible(true);
        
    }
    
}
