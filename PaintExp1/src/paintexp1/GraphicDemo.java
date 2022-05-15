/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paintexp1;

import java.awt.Button;
import java.awt.*;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.*;

/**
 *
 * @author dell
 */
class GraphicDemo extends JFrame implements ActionListener{
    int i;
       private JButton b;
     public GraphicDemo(JButton b){
        this.b = b;
     }
  
    public void actionPerformed(ActionEvent ae) {
      b.setText(i++ +"");
    }
    
      
}
