/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tgride;

import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import javax.swing.JPanel;

/**
 *
 * @author dell
 */
public class TGride {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
              Frame f = new Frame();
        f.setBounds(10, 10, 512, 512);
        f.setLayout(new GridLayout(8,8));
         

//        for(int i=1;i<=8;i++){
//            for(int J=1;J<=8;J++){
//         JPanel p1 = new JPanel();
//        JPanel p2 = new JPanel();
////        JPanel p3 = new JPanel();
////        JPanel p4 = new JPanel();
////        JPanel p5 = new JPanel();
////        JPanel p6 = new JPanel();
////        JPanel p7 = new JPanel();
////        JPanel p8 = new JPanel(); 
//        
//        p1.setBackground(Color.BLACK);
////        p2.setBackground(Color.white);
////        p3.setBackground(Color.BLACK);
////        p4.setBackground(Color.white);
////        p5.setBackground(Color.BLACK);
////        p6.setBackground(Color.white);
////        p7.setBackground(Color.BLACK);
////        p8.setBackground(Color.white);
//            f.add(p1);
//            f.add(p2);
////            f.add(p3);
////            f.add(p4);
////            f.add(p5);
////            f.add(p6);
////            f.add(p7);
////            f.add(p8);
//            }
//        }
         boolean White = true;
           for(int i=1;i<=8;i++){
            for(int J=1;J<=8;J++){
         JPanel p1 = new JPanel();
         JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();
        JPanel p4 = new JPanel();
        JPanel p5 = new JPanel();
        JPanel p6 = new JPanel();
        JPanel p7 = new JPanel();
        JPanel p8 = new JPanel(); 
        
         if(White){
        
        p1.setBackground(Color.BLACK);
         p2.setBackground(Color.white);
        p3.setBackground(Color.BLACK);
        p4.setBackground(Color.white);
        p5.setBackground(Color.BLACK);
        p6.setBackground(Color.white);
        p7.setBackground(Color.BLACK);
        p8.setBackground(Color.white);
         }
         else{
                     p1.setBackground(Color.white);
        p2.setBackground(Color.BLACK);
        p3.setBackground(Color.white);
        p4.setBackground(Color.BLACK);
        p5.setBackground(Color.white);
        p6.setBackground(Color.BLACK);
        p7.setBackground(Color.white);
        p8.setBackground(Color.BLACK);

         }
            f.add(p1);
            f.add(p2);
            f.add(p3);
            f.add(p4);
            f.add(p5);
            f.add(p6);
            f.add(p7);
            f.add(p8);
//        
            }
             White=!White;
        }
           
           for(int i=1;i<=8;i++){
            for(int J=1;J<=8;J++){
         JPanel p1 = new JPanel();
           JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();
        JPanel p4 = new JPanel();
        JPanel p5 = new JPanel();
        JPanel p6 = new JPanel();
        JPanel p7 = new JPanel();
        JPanel p8 = new JPanel();
         if(White){
                     p1.setBackground(Color.white);
        p2.setBackground(Color.BLACK);
        p3.setBackground(Color.white);
        p4.setBackground(Color.BLACK);
        p5.setBackground(Color.white);
        p6.setBackground(Color.BLACK);
        p7.setBackground(Color.white);
        p8.setBackground(Color.BLACK);
        
        p1.setBackground(Color.BLACK);
         }
         else{
       p1.setBackground(Color.BLACK);
         p2.setBackground(Color.white);
        p3.setBackground(Color.BLACK);
        p4.setBackground(Color.white);
        p5.setBackground(Color.BLACK);
        p6.setBackground(Color.white);
        p7.setBackground(Color.BLACK);
        p8.setBackground(Color.white);
         }

         
            f.add(p1);
            f.add(p2);
            f.add(p3);
            f.add(p4);
            f.add(p5);
            f.add(p6);
            f.add(p7);
            f.add(p8);
            }
                     White=!White;

        }
            f.setVisible(true);
    }
    
}
