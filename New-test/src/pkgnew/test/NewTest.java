/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgnew.test;

import javax.swing.JOptionPane;

/**
 *
 * @author dell
 */
public class NewTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = Integer.parseInt(JOptionPane.showInputDialog("bir sayiyi gir"));
                int b = Integer.valueOf(JOptionPane.showInputDialog("bir hix sayisini gir"), 16);
 JOptionPane.showMessageDialog( null, a +"+"+b+"="+Toplam(a, b));
    }
    public static int Toplam(int  a , int b ){
        return a + b ;
    }
    
}
