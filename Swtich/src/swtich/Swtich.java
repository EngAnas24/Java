/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swtich;

import java.util.Scanner;

/**
 *
 * @author dell
 */
public class Swtich {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int Ogr_notu ;
        System.out.println("Notun: ");
        Scanner  input = new Scanner(System.in);
        
Ogr_notu = input.nextInt();
if (Ogr_notu <=100 && Ogr_notu>=90);
        switch(Ogr_notu){
            case 1:
        System.out.println(Ogr_notu+" 100-90 o zaman super ");
        System.out.print("Grad A");
        break;
            case 2:
                         System.out.println(Ogr_notu+"90-80  ");
        System.out.println(Ogr_notu+" cok iyi");
        System.out.print("Grad B");
        break;
          case 3:
                         System.out.println(Ogr_notu+"80-70  ");

        System.out.println(Ogr_notu+" iyi");
                System.out.print("Grad C");

        break;
            default:
                System.out.println(" kotudur");
         
        
        
                
    }
        
    }
    
}
