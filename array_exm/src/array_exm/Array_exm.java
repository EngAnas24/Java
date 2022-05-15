/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array_exm;
import java.util.Scanner;


public class Array_exm {

    
    public static void main(String[] args) {
        int n;
        int i;
        Scanner p = new Scanner(System.in);
        System.out.println("ادخل عدد عناصر المصفوفه ");
        n =p.nextInt();
            int num1[] = new int [n];
        for ( i=0;i<n;i++){
           System.out.println("enter the numbrs that u want: ");
        num1[i] = p.nextInt();
    }
        
    
              for ( i=0;i<n;i++){
        System.out.println("ur namubers :" +num1[i]);
    }
  
    
    }
    
}
