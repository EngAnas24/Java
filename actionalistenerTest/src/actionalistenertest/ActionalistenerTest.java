/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actionalistenertest;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author dell
 */
public class ActionalistenerTest extends JFrame implements ActionListener{
 public ActionalistenerTest(){
     
        this.setSize(300,300);
        this.setLocationRelativeTo(null);
        
        
//        b.addActionListener(this);
     Button b = new Button("Press here");
        
           b.setSize(100,50);
           b.setForeground(Color.red);
           b.addActionListener(this);
            this.add(b,BorderLayout.NORTH);
}

  
    public static void main(String[] args) {
       ActionalistenerTest a =  new ActionalistenerTest();
      a.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
//        System.out.println("wlc to ur frist Frame");
        JOptionPane.showMessageDialog(this, "wlc to ur first Frame");
    }
    
}
