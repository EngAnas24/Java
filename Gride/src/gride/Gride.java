/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gride;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
/**
 *
 * @author dell
 */
public class Gride {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame f = new JFrame();
        f.setLayout(new BorderLayout());
        f.setBackground(Color.WHITE);

        Panel p1 = new Panel();
        p1.setLayout(new GridLayout(8, 8));
        f.add(p1);

      
        ChesListener chessL = new ChesListener();
        String pic[] = {"Rook.png", "Knight.png", "Bishop.png", "King.png", "Queen.png", "Bishop.png", "Knight.png", "Rook.png"};
       
        for (int i = 0; i < 8; i++) {
            for (int J = 0; J < 8; J++) {
                Panel p2 = new Panel();
                p2.setLayout(new BorderLayout());
              
                if ((i+J) % 2 == 0){
                    p2.setBackground(new Color(227,206,184));
                }
                else if((i+J) % 2 == 1){
                p2.setBackground(new Color(105,113,142));
            }
                p1.add(p2);
                JLabel l = new JLabel();
                p2.add(l, BorderLayout.CENTER);
                l.addMouseListener(chessL);
                if (i == 0) {
                    l.setIcon(new ImageIcon(p2.getClass().getResource("/Imags/White" + pic[J])));
                }
                else if (i==1){
                     l.setIcon(new ImageIcon(p2.getClass().getResource("/Imags/WhitePawn.png")));
                }
                else if (i==6){
                     l.setIcon(new ImageIcon(p2.getClass().getResource("/Imags/BlackPawn.png")));
                }
                else if (i==7){
                     l.setIcon(new ImageIcon(p2.getClass().getResource("/Imags/Black"+pic[J])));
                }
            }
        }
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.pack();
        f.setVisible(true);
    }

}
