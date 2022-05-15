/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance1;


public class Inheritance1 {

    
    public static void main(String[] args) {
        Yonetici yonetici = new Yonetici(2,"ANAS", 3000, "bilg.muh");
        yonetici.bilgileriGoster();
        yonetici.yeni_departman("it");
        yonetici.zam_yap(2000);
    }
    
}
