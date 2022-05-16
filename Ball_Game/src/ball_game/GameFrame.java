/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ball_game;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;

/**
 *
 * @author dell
 */
public class GameFrame extends JFrame implements KeyListener, ActionListener {
    private int x;
    private int y;
    private int dirX =2;
     private int dirY =2;
    private int Spead = 10;
    private JLabel ball = new JLabel();
      private JLabel stick = new JLabel();
    public GameFrame() {
        this.setSize(800, 600);
        this.setLayout(null);
        this.getContentPane().setBackground(Color.BLACK);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        
     

        stick.setBackground(Color.white);
        stick.setOpaque(true);
        stick.setBounds(0, 530, 200, 20);
        this.add(stick);
        stick.addKeyListener(this);
        
          Timer timer = new Timer(10, this);
          timer.start();
          
        this.setVisible(true);
        stick.requestFocus();

    }
    
    @Override
    public void paint(Graphics ball){
        ball.fillOval(x,y, 20, 20);
     }

    @Override
    public void keyTyped(KeyEvent ke) {
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        JLabel stick = (JLabel) ke.getSource();
        int x = stick.getX();
        int y = stick.getY();
        if (ke.getKeyCode() == KeyEvent.VK_SPACE) {
            Spead++;
        } else if (ke.getKeyCode() == KeyEvent.VK_UP) {
            stick.setLocation(x, y - Spead);
        } else if (ke.getKeyCode() == KeyEvent.VK_DOWN) {
            stick.setLocation(x, y + Spead);
        } else if (ke.getKeyCode() == KeyEvent.VK_RIGHT) {
            stick.setLocation(x + Spead, y);
        } else if (ke.getKeyCode() == KeyEvent.VK_LEFT) {
            stick.setLocation(x - Spead, y);
        }
    }

    @Override
    public void keyReleased(KeyEvent ke) {
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
       
 
           int x = ball.getX();
        int y = ball.getY();
     
     
            if (ballOnStick() || y<0){
            dirY=-dirY;
            
        }    
            
            if (x>=770||x<0){
                
                dirX = -dirX;
            }
           ball.setLocation(x+dirX, y+dirY);
//            if ( x<=0 ) {
//                 dirY= -dirY;
//                 dirX=+dirX;
//                   ball.setLocation(x+dirX, y+dirY);
//                                     }
//             
//           System.out.println(ball.getWidth()+" ,"+ball.getHeight());
//           
//            if ( x>= 800 ) {
//                 dirY= -dirY;
//                 dirX=-dirX;
//                   
//                                     }
//             ball.setLocation(x+dirX, y+dirY);
//             
    }

    public  boolean ballOnStick(){
        int bx = ball.getX();
        int by = ball.getY();
        
        int sx = stick.getX();
        int sy = stick.getY();
        
         
        if(bx + ball.getWidth() >= sx && bx<= sx+ stick.getWidth() && by + ball.getHeight() >= sy){
            return true;
        }
        else{
            return false;
        }
        }
  

}
