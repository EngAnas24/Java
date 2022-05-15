/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cift_test;

/**
 *
 * @author dell
 */
public class Cift_test {
public static boolean cift_num(int n) {
    for (int i = 0 ;i<n;i++){
        if (n%2!=0){
            return false;
        }
            
    }
    return true;
}

    
    public static void main(String[] args) {
        for (int i = 1;i<30;i++){
            if (cift_num(i)){
       System.out.println("cift_number is : "+i);

            }
        }

        
    }
    
}
