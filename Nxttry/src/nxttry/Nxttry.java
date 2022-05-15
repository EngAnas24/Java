/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nxttry;

/**
 *
 * @author dell
 */
import java.util.Random;
import java.util.Scanner;
public class Nxttry {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random random = new Random();
               int tahmin;
               int tahminSayisi=0;
        Scanner n = new Scanner(System.in);
     int tahmin = random.nextInt(); 
        while(true){
            tahminSayisi++;
        int next= n.nextInt();
        if (next==tahmin){
        break;
        }
        if (next < tahmin){
          System.out.println("Yikari");
        }
        
     
        else {
            System.out.println("asagi");
             
        }
        
   
    }
        System.out.println("tahminsayisi : "+tahminSayisi);
    
}
}
