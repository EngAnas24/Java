/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication117;

import java.util.Random;

/**
 *
 * @author dell
 */
public class JavaApplication117 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           int[] dizi = new int[10]; 
		    int sayac = 0; int i;
		    Random r = new Random();
		    for( i=0; i<10; i++) 
		    { dizi[i] = r.nextInt(50)+1;
                    System.out.print(dizi[i]+ "-"); }
		    System.out.println();
		    for(int x=1; x<dizi.length; x++)
		    {
		        sayac = 0; 
		    for(int j=1; j<=dizi[x]; j++) 
		    { if((dizi[x]%j)==0)
		    { sayac++; } } if(sayac==2 )
		    { System.out.println(dizi[x] + " asal sayıdır");
		    } }
    }
    
}
