/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mousetest;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;

/**
 *
 * @author dell
 */
public class MouseTest extends JFrame implements MouseListener{
  
    
    public MouseTest(){
        
        this.setSize(500,400);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        Button b = new Button("Button");
        this.add(b,BorderLayout.NORTH);
        b.setSize(100,100);
        b.setBackground(Color.BLUE);
        b.addMouseListener(this);
    }
        
   
    public static void main(String[] args) {
        // TODO code application logic here
            MouseTest m = new MouseTest();
            m.setVisible(true);

}

    @Override
    public void mouseClicked(MouseEvent me) {
        System.out.println("Hi u Clicked the Button");
    }

    @Override
    public void mousePressed(MouseEvent me) {
System.out.println("Hi u prssed the Button");    }

    @Override
    public void mouseReleased(MouseEvent me) {
System.out.println("Hi u released the Button");    }

    @Override
    public void mouseEntered(MouseEvent me) {
        System.out.println("Hi u entered the Button");
    }

    @Override
    public void mouseExited(MouseEvent me) {
System.out.println("Hi u Exited the Button");    }
}