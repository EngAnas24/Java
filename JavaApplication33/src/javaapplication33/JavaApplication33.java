/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication33;

/**
 *
 * @author dell
 */
import java.util.Scanner ;

public class JavaApplication33 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
double [] nums= new double[6];
int i;
Scanner m = new Scanner(System.in);
for( i =1;i<nums.length;i++){
    System.out.println("enter : ");
   nums(i) =  m.nextDouble();
}
    
    int item;
        System.out.println("enter a number");
    item = m.nextInt();
    for (k=1;i<nums.length;k++)
        if (nums(k)==item){
            System.out.println(k);
        }
    }
}
        
}
