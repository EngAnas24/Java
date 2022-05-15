/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movemousetest;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.JButton;

/**
 *
 * @author dell
 */
class Movelistener implements MouseMotionListener, KeyListener{

    private int  Spead  =  3;
    @Override
    public void mouseDragged(MouseEvent me) {
        JButton b = (JButton) me.getSource();
        b.setLocation(me.getLocationOnScreen());
    }

    @Override
    public void mouseMoved(MouseEvent me) {
       
    }

    @Override
    public void keyTyped(KeyEvent ke) {
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        JButton b = (JButton) ke.getSource();
        int x = b.getX();
        int y = b.getY();
           if( ke.getKeyCode() == KeyEvent.VK_SPACE){
               Spead++;
           }
       
       
           else if( ke.getKeyCode() == KeyEvent.VK_UP)
       {
           b.setLocation(x, y-Spead);
    }
       else  if( ke.getKeyCode() == KeyEvent.VK_DOWN)
       {
           b.setLocation(x, y+Spead);
       }
        else  if( ke.getKeyCode() == KeyEvent.VK_RIGHT)
       {
           b.setLocation(x+Spead, y);
       }
        else  if( ke.getKeyCode() == KeyEvent.VK_LEFT)
       {
           b.setLocation(x-Spead, y);
       }
    }

       
    
    
    @Override
    public void keyReleased(KeyEvent ke) {
    }
    
}
