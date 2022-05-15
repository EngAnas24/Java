/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package func_test1;

import javafx.scene.input.KeyCode;

/**
 *
 * @author dell
 */
public class Func_test1 {
public static int toplama(int a, int b){
   // return a+b;
    int z = a+b;
    return z;
}
public static int carpma(int y, int x){
return y*x;
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // System.out.println("toplam: "+toplama(5,7));
       int d = 7+8;
        System.out.println("toplam: "+d);
                System.out.println("carpma :  "+carpma(6,5));

    }
    
}
