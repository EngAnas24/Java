/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test3;

import java.util.Scanner;

/**
 *
 * @author dell
 */
public class Test3 {
public static int topla(int a, int b){
    return a+b;
}
public static int topla(int a, int b,int c){
    return a+b+c;
}
    public static int toplam(int dizideger[]){
    int  tpm = 0;
for( int s:dizideger)
    tpm+=s ;
    
return tpm; 
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int [] arr = new int [100];
         Scanner n = new Scanner(System.in);
         
        
        System.out.println("enter the  numbers: ");
        for (int i =0;i<=10;i++){
           arr[i] = n.nextInt();

        }
        System.out.println("toplam: "+topla(7, 9));
        System.out.println("toplam: "+topla(7, 9 , 8));
                           System.out.println(toplam(arr));

    }
}
