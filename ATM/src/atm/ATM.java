/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

import java.util.Scanner;

public class ATM {
    public void calis(Hesap hesap){
        Login login = new Login();
        Scanner input = new Scanner(System.in);
        System.out.println("bankamiza hos geldiniz");
        System.out.println("******************************************");
        System.out.println("kullnici giris : ");
        System.out.println("*********************");
        int giris_haki=3;
        while(true){
            if(login.login(hesap)){
            System.out.println("basarili girilmis ");
            break;
        }
            else {
                    System.out.println("basarisiz giris");
                    System.out.println("kullinci adiyi yada parolayi yalnis girdiniz,...yeni deneyin");
                    giris_haki-=1;
                    System.out.println("kalan giris haki = "+giris_haki);
                    }   
            if (giris_haki==0){
                System.out.println("kalan giris hakiniz bitti");
                
                            return;

            }
        }
        
        String islemler= "1.hesapiniz goruntu\n"
                +"2.para yatirma\n"
                +"3.para cekme\n"+
                "cikmak icin 'q'ya basin";
        System.out.println(islemler);
        System.out.println("*************************");
        while(true){
            System.out.println("isleminiz seciniz: ");
            String islem = input.nextLine();
            if (islem.equals("q")){
                break;
            }
            else if (islem.equals("1")){
                System.out.println("bakiye: "+hesap.getBakiye());
        }
            else if (islem.equals("2")){
                System.out.println("para yatiracagini koyun: ");
                int tutar = input.nextInt();
                input.nextLine();
                hesap.paraYatirma(tutar);
                
                        
            }
            else if (islem.equals("3")){
                System.out.println("cekecegini para secin: ");
                int tutar = input.nextInt();
                input.nextLine();
                hesap.paraCekme(tutar);
                
                        
            }
            else{
                System.out.println("yanlis bastiniz");
            }
        }
        
    }

    
}
