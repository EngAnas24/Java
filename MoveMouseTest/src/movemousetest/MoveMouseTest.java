/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movemousetest;

import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author dell
 */
public class MoveMouseTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame f = new JFrame();
        f.setLayout(null);
            f.setPreferredSize(new Dimension(500,500));
            f.setLocationRelativeTo(null);

            JButton b = new JButton("ANAS");
        b.setBounds(100,0,100,40);
        f.add(b);
        
        Movelistener mv = new Movelistener();
        b.addMouseMotionListener(mv);
         
        b.addKeyListener(mv);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
    
}
