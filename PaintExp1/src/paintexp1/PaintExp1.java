/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paintexp1;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Panel;
import java.awt.PopupMenu;
import java.sql.Time;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.Timer;

/**
 *
 * @author dell
 */
public class PaintExp1 extends JFrame{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame f  = new JFrame();
        f.setLocationRelativeTo(null);
        f.setSize(500,500);
         f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
         Panel mainPanel = new Panel();
         f.add(mainPanel);
         mainPanel.setLayout(new FlowLayout());
         mainPanel.setBackground(Color.black);
   
         JButton b =new JButton();
         b.setPreferredSize(new Dimension(200,200));
       mainPanel.add(b);
       b.setBackground(Color.white);
      
        
       GraphicDemo graphicDemo = new GraphicDemo(b);
       b.addActionListener(graphicDemo);
         
         
      
         
         Timer t = new Timer(1000,graphicDemo);
       t.start();
        f.setVisible(true);
    }
     
         
}
