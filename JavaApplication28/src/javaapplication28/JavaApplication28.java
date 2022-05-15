/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication28;

public class JavaApplication28 {

    public static void nums(int [] numbers){
        for (int arr : numbers)
            disPlay(arr);
    }
    public static void main(String[] args) {
        int [] numbs = {1,2,3,4,5,6};
        nums(numbs);
    }
    public static void disPlay(int nums){
        System.out.println(nums);
    }
}
