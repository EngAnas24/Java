/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package max.anad.min;

import java.util.Scanner;
public class MaxAnadMin {

    public static void main(String[] args) {
        // TODO code application logic here
        double[] nums = new double[5];
        Scanner v = new Scanner(System.in);
                System.out.println( "ur numbers: ");
        for(int i=0;i<5;i++){
            nums[i] = v.nextDouble();
        }
        double max= nums[0];
                double min=nums[0];
                        for(int i=0;i<nums.length;i++){
                            if (nums[i]<min){
                                min=nums[i];
                            }
                            if (nums[i]>max){
                              max=nums[i];
                            }  
                        }
                        System.out.println("max number is : "+max);
                       System.out.println("min number is : "+min);

                        
                
            

    }
    
}
