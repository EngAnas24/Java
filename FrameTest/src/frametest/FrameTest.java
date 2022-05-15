/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frametest;

import java.awt.Frame;
import java.awt.Point;
import java.awt.Toolkit;

/**
 *
 * @author dell
 */
public class FrameTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Frame f = new Frame();
        f.setSize(500,500);
        int ScreenH=Toolkit.getDefaultToolkit().getScreenSize().height; 
         int ScreenW =Toolkit.getDefaultToolkit().getScreenSize().width;
         int y = (ScreenH - f.getHeight())/2;
         int x = (ScreenW - f.getWidth())/2;

        f.setLocation(x,y);

        f.setVisible(true);
    }
    
}
