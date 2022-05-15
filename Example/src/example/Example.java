/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author dell
 */
public class Example {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int sayi  = Integer.valueOf(JOptionPane.showInputDialog("dizinin buyutunu girin"));
        double dizi [] = getrandom(sayi);
        JOptionPane.showMessageDialog(null," "+ topla(dizi)/sayi);
        
    }
    public static double  [] getrandom(int length){
        Random random = new Random(100);
        double [] result = new double[length];
                for (int i = 0;i<length;i++){
                    result[i] = random.nextDouble()*100;
                    
                }
                return result;
    }
    public static double topla(double dizi[]){
        double sum = 0;
        for(int i = 0 ;i<=dizi.length;i++){
            sum+=dizi[i];
        }
        return sum;
        }
    }
    

