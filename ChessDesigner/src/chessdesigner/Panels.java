/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chessdesigner;

import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author dell
 */
public class Panels extends JPanel{
    
    public Panels(String Type,Color c1,Color c2,Color c3 ,Color c4,Color c5,Color c6,Color c7,Color c8){
         
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();
        JPanel p4 = new JPanel();
        JPanel p5 = new JPanel();
        JPanel p6 = new JPanel();
        JPanel p7 = new JPanel();
        JPanel p8 = new JPanel();

        
        p1.setBackground(c1);
        p2.setBackground(c2);
        p3.setBackground(c3);
        p4.setBackground(c4);
        p5.setBackground(c5);
        p6.setBackground(c6);
        p7.setBackground(c7);
        p8.setBackground(c8);
            add(p1);
            add(p2);
            add(p3);
            add(p4);
            add(p5);
            add(p6);
            add(p7);
            add(p8);
            
        }
     
      
    }

