/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gcd_while;

import java.util.Scanner;

/**
 *
 * @author dell
 */
public class Gcd_while {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
        Scanner input = new Scanner(System.in);
        System.out.println("enter the first number: ");
       int  num1=input.nextInt();
        System.out.println("enter the second number: ");
        int  num2=input.nextInt();
while(num1!=num2){
    if (num1>num2)
        num1-=num2;
    else
        num2-=num1;
}
        System.out.println(num2);
    
}

    
    
}
