/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listarray_;
import java.util.ArrayList;
import java.util.Scanner;
public class ListArray_ {

  
    public static void main(String[] args) {
        ArrayList numbers  = new ArrayList();
        int [] nums = new int [10];
    
        Scanner input =  new Scanner(System.in);
        System.out.println("inter a number : ");
        for (int i=0;i<=5;i++){
            numbers.set(i, input.nextInt());
            
        }
      for (int i=0;i<=5;i++){
          System.out.println("ur numbers are : "+numbers.get(i));
        }
    }
}
//            
//       n= input.nextInt();
//                }
//                System.out.println("ur numbers are : "+numbers);
//                        for (int i=0;i<=5;i++){
//
//        System.out.println("ur numbers are :\t"+nums[i]);
//        
//    }
//        for (int n : nums){
//                    System.out.println("ur numbers are :\t"+n);
//
//        }
//}
//    


