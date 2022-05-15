/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chessdesigner;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author dell
 */
public class ChessDesigner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         JFrame f = new JFrame();
        f.setBounds(10, 10, 512, 512);
        f.setLayout(new GridLayout(8,8));
        
      Panels GRid1  = new Panels("H", Color.WHITE, Color.black, Color.WHITE, Color.black, Color.WHITE, Color.black, Color.WHITE, Color.black);
      f.add(GRid1);
            Panels GRid2  = new Panels("H", Color.WHITE, Color.black, Color.WHITE, Color.black, Color.WHITE, Color.black, Color.WHITE, Color.black);
        f.add(GRid2);
 
            Panels GRid3  = new Panels("H", Color.WHITE, Color.black, Color.WHITE, Color.black, Color.WHITE, Color.black, Color.WHITE, Color.black);
        f.add(GRid3);

        
                  Panels GRid4  = new Panels("H", Color.WHITE, Color.black, Color.WHITE, Color.black, Color.WHITE, Color.black, Color.WHITE, Color.black);
        f.add(GRid4);

        
             Panels GRid5  = new Panels("H", Color.WHITE, Color.black, Color.WHITE, Color.black, Color.WHITE, Color.black, Color.WHITE, Color.black);
        f.add(GRid5);

                   Panels GRid6  = new Panels("H", Color.WHITE, Color.black, Color.WHITE, Color.black, Color.WHITE, Color.black, Color.WHITE, Color.black);
        f.add(GRid6);

                         Panels GRid7  = new Panels("H", Color.WHITE, Color.black, Color.WHITE, Color.black, Color.WHITE, Color.black, Color.WHITE, Color.black);
                                 f.add(GRid7);

      Panels GRid8  = new Panels("H", Color.WHITE, Color.black, Color.WHITE, Color.black, Color.WHITE, Color.black, Color.WHITE, Color.black);
        f.add(GRid8);

        
      
        
            f.setVisible(true);
    }
    
}
