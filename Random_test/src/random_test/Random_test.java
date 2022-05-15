/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package random_test;

import java.util.Random;

/**
 *
 * @author dell
 */
public class Random_test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random ra = new Random();
        int sum1;       
        sum1 = ra.nextInt(10);
         int n = 11;
       int x = 9;
        sum1+=n+x;
        System.out.println(sum1);
        
      
//        int sum = (int)(n+ Math.random()*x);
//        System.out.println(sum);
//    }
    }
}
