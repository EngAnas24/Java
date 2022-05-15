/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package batman_hastanesi;

import java.util.Scanner;

/**
 *
 * @author dell
 */
public class Batman_Hastanesi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Hasta hasta =  new Hasta("AHMED", "0536223645", "AHMED242@gmail.com", "9998387264");
        hasta.bilgileri_Goster();
        System.out.println( hasta.Hastaliklar_kisimlari());
         String  Kisim ;
        String SecKisim = hasta.SecKisim(Kisim);
        
         Scanner input = new Scanner(System.in);
     Kisim = input.nextLine();
   String Doktor= input.nextLine();
    while(true){
    if(Kisim.equals("1"))
            {
                System.out.println("Musait Doctorler :"
                        + "Ahmed"
                        + "Ali"
                        + "Hanan"
                        + "Amr"
                        + "Hamzah"
                        + "............."
                        + "kiminle konusmak istiyorsun? ");
                if(Doktor.equals("1")){
        System.out.println("reservasyonunu yapilmis");
        break;
        
    }
            }
    
    }
    if(Kisim.equals("q")){
        System.out.println("Teskkurler size "
                + "Salametle Kalin !");
        break;
    }
    }


    

   
    

