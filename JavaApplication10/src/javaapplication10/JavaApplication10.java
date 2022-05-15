/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication10;
import java.util.Scanner;
/**
 *
 * @author dell
 */
public class JavaApplication10 {

    public static void main(String[] args) {
        int m;
        Scanner n=new Scanner(System.in);
        System.out.println("write the numbers of  names : ");
        m = n.nextInt();
        String[] names  = new String(m);

        for (int i=1;i<=m;i++ ){
            System.out.println("write the names thats u want : ");
 names[i] = n.next();
        }
        for (int i=0;i<m;i++ ){
                    System.out.println("names : "+names[i]);
                   }

        // TODO code application logic here
    }
    
}
