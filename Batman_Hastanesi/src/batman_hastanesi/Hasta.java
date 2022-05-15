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
class Hasta {
    private String isim;
    private String  numara;
    private String email;
    private String kimlik_numarasi;
   public String Kisim;

 
    public void bilgileri_Goster() {
        System.out.println("isiminiz : "+isim+"\nnumaraniz: "+numara+"\nkimlik numarasi : "+kimlik_numarasi+"\n emailiniz: "+email);
    }

    public Hasta(String isim, String numara, String email ,String kimlik_numarasi) {
        this.isim = isim;
        this.numara = numara;
        this.email = email;
        this.kimlik_numarasi= kimlik_numarasi;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String  getNumara() {
        return numara;
    }

    public void setNumara(String numara) {
        this.numara = numara;
    }

    public String getKimlik_numarasi() {
        return kimlik_numarasi;
    }

    public void setKimlik_numarasi(String kimlik_numarasi) {
        this.kimlik_numarasi = kimlik_numarasi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
     public static String Hastaliklar_kisimlari(){
        return "Acil Polikliniği (Genel)\n" +
"Anestezi\n" +
"Beyin Cerrahi\n" +
"Enfeksiyon Hastalıkları ve Klinik Mikrobiyoloji\n" +
"Endokrinoloji\n" +
"Erişkin Ruh Sağlığı ve Hastalıkları (PSİKİYATRİ)\n" +
"Gastroentroloji\n" +
"Genel Cerrahi\n" +
"Hematoloji\n" +
"İç Hastalıkları (DAHİLİYE)\n" +
"Kalp Damar Cerrahi\n" +
"Kulak Burun  Boğaz Hastalıkları (KBB)\n" +
"Nefroloji\n" +
"Nöroloji\n" +
"Ortopedi\n" +
"Plastik Cerrahi\n" +
"Üroloji\n" +
"TIBBİ ONKOLOJİ\n" +
"RADYASYON ONKOLOJİSİ\n" +
"MR\n" +
"TOMOGRAFİ\n" +
"YOĞUN BAKIM ÜNİTELERİ\n" +
"PATOLOJİ\n" +
"SAĞLIK KURULU"
                + "Cikmak icin pass q";
        
}
     
    public  String SecKisim(String Kisim ){
        return " hastalik kisimi sec: "+Kisim;
    }
   
   
            }


