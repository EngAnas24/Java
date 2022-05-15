/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labeltest;

import java.awt.*;
import javax.swing.*;



/**
 *
 * @author dell
 */
public class LabelTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame f  = new JFrame();
        f.setSize(500,500);
        f.setLayout(new FlowLayout());
        JButton b1 = new JButton("Ok");
        f.add(b1);
       b1.setBackground(Color.green);

        JLabel L1 = new JLabel("Hamza");
        f.add(L1);
        L1.setOpaque(true);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        f.setVisible(true);
    }
    
}
