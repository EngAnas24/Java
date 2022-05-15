/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays_test;

 
public class Arrays_test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int [][] test1={{1,2,3},{4,5,6}};
         int [][] test2={{20,30,40},{50,60,70}};
         for (int i=0;i<test1.length;i++){
         for (int j=0;j<test1[i].length;j++){
             System.out.print(test1[i][j]+ " ");
         }
                           System.out.println();

         }

         System.out.println("+++++++++++++");
         
         for (int i=0;i<test2.length;i++){
         for (int j=0;j<test2[i].length;j++){
             System.out.print(test2[i][j]+ " ");
         }
                  System.out.println();

         }
         System.out.println("===============");
         for (int i=0;i<test2.length;i++){
         for (int j=0;j<test2[i].length;j++){
             System.out.print((test2[i][j]+test1[i][j])+ " ");
         }
                  System.out.println();

         }
    }
    
}
