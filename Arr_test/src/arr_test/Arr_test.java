/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arr_test;

/**
 *
 * @author dell
 */
import java.util.Arrays;
import java.util.Random;

public class Arr_test {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int   dizi [] = new int [1000];
        Random random =  new Random();
        for (int i = 0;i<=dizi.length;i++){
            
        dizi[i] = random.nextInt(100);
    }
        System.out.println(Arrays.toString(dizi));
}
}
//    public static void Array(){
//        System.out.println(" ");
//    }
//    }
        
