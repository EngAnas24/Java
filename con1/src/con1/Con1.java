/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package con1;

import java.util.Scanner;

/**
 *
 * @author dell
 */
public class Con1 {

    public static void main(String[] args) {
         int result=1,num;
        int counter=1;
        Scanner n = new Scanner(System.in);
        while (counter<=5) {
         System.out.println("enter a positive number : ");        
          num = n.nextInt();
 
            if (num<1){
                System.out.println("u entered a negative number");
                continue;
            }
            result*=num;
            counter++;
        }
        System.out.println("result is = "+result);
    }
    
}
