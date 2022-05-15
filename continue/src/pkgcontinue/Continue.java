/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgcontinue;
import java.util.Scanner;

public class Continue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int sum=0,num;
        int counter=1;
        Scanner n = new Scanner(System.in);
        while (counter<=5) {
         System.out.println("enter a positive number : ");        
          num = n.nextInt();
 
            if (num<1){
                System.out.println("u entered a negative number");
                continue;
            }
            sum+=num;
            counter++;
        }
        System.out.println("sum is = "+sum);
            
    }
    
}
