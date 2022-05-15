/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asal;

/**
 *
 * @author dell
 */
public class Asal {
public static boolean asal_nums(int n){
    for (int i=2;i<n;i++){
        if (n%i==0){
            return false;
        }
    }
    return true;
    
    
}

    public static void main(String[] args) {
        for (int i = 2;i<1000;i++){
            if(asal_nums(i)){
                System.out.println(i);
            }
        }
    }
    
}
