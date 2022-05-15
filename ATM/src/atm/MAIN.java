/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

/**
 *
 * @author dell
 */
public class MAIN {

    public static void main(String[] args) {
     ATM atm = new ATM();
     Hesap hesap = new  Hesap("ANAS", "12345",1000.0);
     atm.calis(hesap);
        System.out.println("programdan cikiliyor");
    }

  
    
}
