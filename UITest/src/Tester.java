
import javax.swing.*;
import java.awt.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dell
 */
public class Tester  extends JFrame{
    
    public  Tester(){
        super("paint");
        setBounds(0,0,500,500);        
        JlabelPaint label = new JlabelPaint();
         label.setBounds(200, 100, 200, 200);
         add(label);
         
    }
    public static void main(String[] args) {
        JFrame f = new Tester();
        f.setVisible(true);
    }
    private class JlabelPaint extends JLabel{

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setColor(Color.red);
            g.drawOval(0, 0, 100, 100);
        }
        
    }
}
