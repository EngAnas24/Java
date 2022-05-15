/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gcd;


 import java.util.Scanner;
public class Gcd {
    public static int gcd(int x,int y ) {
        int gcd = 1;
        for (int i=1;i<x&&i<y;i++){
            if (x%i==0&&y%i==0){
                gcd = i;
                
        }
    }
                    return gcd;

}
    public static void main(String[] args) {
        //System.out.println("ur gcd is "+ gcd(25, 35));
    Scanner input  = new Scanner(System.in);
        System.out.println("enter the first number : ");
        int z = input.nextInt();
       System.out.println("enter the first number : ");
        int d = input.nextInt();

           System.out.println("ur gcd:"+gcd(z,d));
}
}