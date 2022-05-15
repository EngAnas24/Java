/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gride;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JLabel;

/**
 *
 * @author dell
 */
public class ChesListener implements MouseListener{

    private JLabel selectedL = null;
    public ChesListener() {
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        JLabel l =(JLabel) me.getSource();
        if(l.getIcon()!= null){
            selectedL = l;
        }
        else{
           if(selectedL != null){
               l.setIcon(selectedL.getIcon());
               selectedL.setIcon(null);
               selectedL= null;
           }
        }
    }

    @Override
    public void mousePressed(MouseEvent me) {
         JLabel l =(JLabel) me.getSource();
        if(l.getIcon()!= null){
           
            selectedL = l;
             selectedL.setBackground(Color.red);
            l.setOpaque(true);
        }
        else{
           if(selectedL != null){
               l.setIcon(selectedL.getIcon());
               selectedL.setIcon(null);
               selectedL= null;
                l.setBackground(null);
               
    }
        }
    }
    @Override
    public void mouseReleased(MouseEvent me) {
        
    }

    @Override
    public void mouseEntered(MouseEvent me) {
         JLabel l =(JLabel) me.getSource();
                l.setBackground(Color.blue);
                l.setOpaque(true);
    }

    @Override
    public void mouseExited(MouseEvent me) {
                 JLabel l =(JLabel) me.getSource();
                l.setBackground(null);
                l.setOpaque(false);
    }
    
}
