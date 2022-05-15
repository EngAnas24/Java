/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s;

import java.util.Scanner;


public class S {

   
    public static void main(String[] args) {
        int n,i;
        double e=0;
        int  x;
        Scanner input = new Scanner(System.in);
       
        System.out.println("enter the value of x: ");
        x = input.nextInt();
        System.out.println("enter the value of n: ");
        n = input.nextInt();
        for (i= 0;i<=n;i++){
            e=(Math.pow(x,i)/n);
        }
        System.out.println("e value is = "+e);
        
    }
    
}
