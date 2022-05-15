/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tcth;

import javax.swing.JOptionPane;

/**
 *
 * @author dell
 */
public class TCth {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
        int num1= 8;
        int num2= 4;
        int  num3 = 0;
        double result1 = 8/4;
        double result2 = 8/0;
        

                System.out.println(result1);

      System.out.println(result2);


        }
        catch(Exception ex){
                
    System.out.println("u cant divid "+ex.getMessage());
    JOptionPane.showMessageDialog(null, "لا يمكنك القسمه على الصفر");

                }


    }
    }
    

