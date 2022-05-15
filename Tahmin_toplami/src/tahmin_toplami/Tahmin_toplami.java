/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tahmin_toplami;

import java.util.Random;

/**
 *
 * @author dell
 */
public class Tahmin_toplami {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int toplam=0;
        Random r = new Random();
        int tahmin=r.nextInt();
        for(int i = 1;i<=10;i++){
        toplam+=tahmin;
        }
                System.out.println("Toplam = "+toplam);

    }
    
}
