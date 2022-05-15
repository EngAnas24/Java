/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iconeframe;

import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author dell
 */
public class IconeFrame extends JFrame{
    public IconeFrame(){
       setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        setLayout(new FlowLayout());
        ImageIcon icon = new ImageIcon(getClass().getResource("b3.bmp"));
        
        setIconImage(icon.getImage());
        setVisible(true);
    }
    public static void main(String[] args) {
        // TODO code application logic here
    new IconeFrame();
    }
    
}
