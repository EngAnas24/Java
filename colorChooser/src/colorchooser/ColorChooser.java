/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colorchooser;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

/**
 *
 * @author dell
 */
public class ColorChooser extends JFrame implements ActionListener{

    public ColorChooser() {
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(30,30));
        JColorChooser cc = new JColorChooser();
        Button b = new Button();
        b.setPreferredSize(new Dimension(60,30));
        add(cc);
        add(b,BorderLayout.NORTH);
       b.setActionCommand("b1");
        Button b2 = new Button();
       b2.setActionCommand("b2");
        add(b2,BorderLayout.WEST);
      
        JFileChooser fch = new JFileChooser();
        File file = fch.getSelectedFile();
        setVisible(true);
    }
   
    
    public static void main(String[] args) {
        // TODO code application logic here
        new ColorChooser();
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
      
        Button b2 = (Button) ae.getSource();
        JFileChooser fch = new JFileChooser();
      File file = fch.showOpenDialog(null);
        System.out.println(fch);
        }
    
         
}
