/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

/**
 *
 * @author dell
 */
import java.util.Scanner;
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 int n;
        Scanner s = new Scanner(System.in);
                System.out.println("enter the number of student : ");;
        n = s.nextInt();
                int ogr_num[] = new int[n];
        for(int i = 1; i <= n; i++)
        {
           
            System.out.println(i+"-enter the result :  ");
                        ogr_num[i] = s.nextInt();

        }
        
        
}
}