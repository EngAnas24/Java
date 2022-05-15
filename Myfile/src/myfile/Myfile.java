
package myfile;

import java.io.PrintWriter;

import javax.swing.JOptionPane;


public class Myfile {

   
    public static void main(String[] args) {
        try {
            PrintWriter w = new PrintWriter("myFile.txt");
            w.println("wlc");
            w.close();
        } 
        catch (Exception ex) {
            JOptionPane.showMessageDialog(null,ex);
        }
    }
    
}
