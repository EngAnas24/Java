/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question;

import sun.security.x509.DeltaCRLIndicatorExtension;
import java.util.Scanner;
public class Question {
    public static void equastion(int a,int b,int c) {
        
     int delta =(b*b) +4*a*c;
     if (delta<0){
         System.out.println("no saloution");
     }
     else{
         double x1=(-b+Math.sqrt(delta))/(a*2);
         double x2=(-b-Math.sqrt(delta))/(a*2);
         System.out.println("X1: "+x1);
         System.out.println("X2: "+x2);
     }
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the numbers that u want");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        equastion(a, b, c);
        


        
    }
    
}
