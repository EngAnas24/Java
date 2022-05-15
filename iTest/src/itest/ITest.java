/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itest;

/**
 *
 * @author dell
 */
public class ITest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] a = new int[3];
        int i;
                int [] b = new int[3];
                for( i=1;i<a.length;i++);{
                a[i]=i;
                b= a;
     System.out.println(a[2]+" "+b[2]);
     a[2]= 10;
     System.out.println(a[2]+" "+b[2]);
     


    }
    }
}
