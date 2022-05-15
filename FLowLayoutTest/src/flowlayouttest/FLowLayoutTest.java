/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flowlayouttest;

import java.awt.*;
import javax.swing.*;
import javax.swing.JFrame;

/**
 *
 * @author dell
 */
public class FLowLayoutTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Frame f = new Frame ("Test Frame");
        f.setBounds(500,500,500,160);
        f.setLayout(new BorderLayout(5,5));
//        f.DefaultCloseOperation(f.EXIT_ON_CLOSE);
        Panel p1 = new Panel();
        Panel p2 = new Panel();
        Panel p3 = new Panel();
        Panel p4 = new Panel();
        Panel p5 = new Panel();
       Button b1 = new Button("Hi ! do u see me ?");
        Button b2 = new Button();
        Button b3 = new Button();
         Button b4 = new Button();
//         b1.setBounds(90,20,250,160);
//         b2.setBounds(90,20,250,170);
//         b3.setBounds(90,20,250,180);
//         b4.setBounds(90,20,250,190);
          f.add(p1,BorderLayout.SOUTH);
          f.add(p2,BorderLayout.NORTH);
          f.add(p3,BorderLayout.CENTER);
          f.add(p4,BorderLayout.WEST);
          f.add(p5,BorderLayout.EAST);
         p1.add(b1);
         p1.add(b2);
         p1.add(b3);
         p1.add(b4);
                  f.setBackground(Color.WHITE);

         p1.setBackground(Color.black);
                  p2.setBackground(Color.black);

                           p3.setBackground(Color.black);

                                    p4.setBackground(Color.black);

                                             p5.setBackground(Color.black);

                                             
         b1.setBackground(Color.yellow);
         
           p1.setPreferredSize(new Dimension(500, 80));
           p2.setPreferredSize(new Dimension(500, 80));
           p3.setPreferredSize(new Dimension(500, 80));
           p4.setPreferredSize(new Dimension(80, 400));
           p5.setPreferredSize(new Dimension(80, 400));
           b1.setSize(30,30);
           b1.setLocation(250, 200);
//         p1.add(b1);
//         p1.add(b2);
//         p1.add(b3);
//         p1.add(b4);
//         
           
        f.setVisible(true);
        
        
    }
    
}
