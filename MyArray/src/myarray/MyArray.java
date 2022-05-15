/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myarray;

import java.util.Scanner;

/**
 *
 * @author dell
 */
public class MyArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AnasList arr = new AnasList();
       arr.Add(10);
        arr.Add(20);
               
        
        System.out.println("the number is : \n");
        for (int i = 0 ; i<arr.arr1.length;i++)
            System.out.println(arr.arr1[i]);
                
    }
    
}
