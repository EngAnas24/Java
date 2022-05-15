
package tr2;

class kopek extends Hayvan{
    private String dis_sayisi;
    public kopek(String name, double boy, double kilo,String dis_sayisi) {
        super(name, boy, kilo);
        this.dis_sayisi= dis_sayisi;
    }
   
     public void harakete_gec(int hiz ){
     System.out.println("kopek "+hiz+"ile haraket edyor....");
 }
    
     public void kos(int hiz){
        System.out.println("kopek kosuuyor...");
           super.harakete_gec(hiz);

    
}

    @Override
    void bligi() {
        super.bligi();
        //To change body of generated methods, choose Tools | Templates.
    }

    public String getDis_sayisi() {
        return dis_sayisi;
    }

    public void setDis_sayisi(String dis_sayisi) {
        this.dis_sayisi = dis_sayisi;
    }
  
}
