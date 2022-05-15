/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package while_test;

/**
 *
 * @author dell
 */
public class While_test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n=1;
        int sum=0;
        double avg=0;
        do{
            sum+=n;
   n++;
        }
                while (n>10);

        
        avg=sum/n;
        System.out.println("ur sum is : "+sum);
                System.out.println("ur avg is : "+avg);
    }
    
}
