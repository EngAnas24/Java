
package covertion_test;

import javafx.css.ParsedValue;
import javax.swing.JOptionPane;


public class Covertion_test {

    public static void main(String[] args) {
        // TODO code application logic here
        String n="9";
        int x = 99;
        System.out.println(String.valueOf(x));
      
        System.out.println(Integer.parseInt(n));
        int b = Integer.valueOf(JOptionPane.showInputDialog("birinci sayiyi girin : "));
                int c = Integer.valueOf(JOptionPane.showInputDialog("birinci sayiyi girin : "));
        int sayi3 = Integer.valueOf(JOptionPane.showInputDialog("Birinci Sayıyı Girin"));
        JOptionPane.showMessageDialog(null,b );
                JOptionPane.showMessageDialog(null,c );
                        JOptionPane.showMessageDialog(null,sayi3);


    }
    
}
