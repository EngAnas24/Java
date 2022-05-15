/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t1;

/**
 *
 * @author dell
 */
public class T1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
       int n = 10, t1 = 0, t2 = 1;
        System.out.print("First " + n + " terms: ");

        for (int i = 1; i <= n; i++)
        {
            System.out.print(t1 + " , ");

            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }

    }
    
}
