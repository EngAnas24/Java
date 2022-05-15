/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flages;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author dell
 */
public class Flages {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int height=500;
        int weight=500;
        Frame f =  new Frame();
        f.setSize(weight, height+15);
        Panel p1 = new Panel();
        f.add(p1,BorderLayout.NORTH);
        p1.setBackground(Color.WHITE);
        p1.setPreferredSize(new Dimension(weight/3,height/3));
        p1.setLayout(new BorderLayout());
        
        Panel p2 = new Panel();
        p1.add(p2,BorderLayout.NORTH);
        p2.setBackground(Color.red);
        p2.setPreferredSize(new Dimension(55,55));
        
        Panel p3 = new Panel();
        p1.add(p3,BorderLayout.SOUTH);
        p3.setBackground(Color.BLACK);
        p3.setPreferredSize(new Dimension(55,55));
        
        Panel p4 = new Panel();
        f.add(p4,BorderLayout.CENTER);
        p4.setBackground(Color.yellow);
        p4.setLayout(new BorderLayout());
        
        Panel p5 = new Panel();
        p4.add(p5,BorderLayout.NORTH);
        p5.setBackground(Color.red);
        p5.setPreferredSize(new Dimension(weight/3,55));
        
        Panel p6 = new Panel();
         p6.setPreferredSize(new Dimension(weight/3,55));
        p4.add(p6,BorderLayout.SOUTH);
        p6.setBackground(Color.BLACK);
        
         Panel p7 = new Panel();
         p1.setLayout(new BorderLayout());
        p7.setPreferredSize(new Dimension(weight,height/3));
                 f.add(p7,BorderLayout.SOUTH);


        Panel p8 = new Panel();
        p8.setPreferredSize(new Dimension(weight/3,height/3));
         p8.setLayout(new BorderLayout());
        p8.setBackground(Color.green);
                p7.add(p8,BorderLayout.EAST);


        
         Panel p9 = new Panel();
        
          p9.setLayout(new BorderLayout());
        p8.setPreferredSize(new Dimension(weight/3,height/3));
        p8.setBackground(Color.red);
         p7.add(p9,BorderLayout.WEST);
        
        Panel p10 = new Panel();
        p10.setBackground(Color.WHITE);
         p10.setLayout(new BorderLayout());
        p10.setPreferredSize(new Dimension(weight/3,height/3));
        p7.add(p10,BorderLayout.CENTER);
        
        f.setVisible(true);
        
    }
    
}
