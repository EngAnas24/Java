/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dell
 */
public class Yonitici extends Calisan {
    private  int sorumlu_kisi_sayisi;
    public Yonitici(String Ad, String Soyad, int id,int sorumlu_kisi_sayisi) {
        super(Ad, Soyad, id);
        this.sorumlu_kisi_sayisi = sorumlu_kisi_sayisi;
    }

    @Override
    public void bilgileri() {
        super.bilgileri(); //To change body of generated methods, choose Tools | Templates.
        
    }
    public void zamYap(int zamMiktari) {
        
        System.out.println(getAd() + " çalışanlara " + zamMiktari + " kadar zam yapıyor...");
    } 
    
}

