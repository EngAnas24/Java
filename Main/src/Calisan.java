
public class Calisan {
    private String Ad;
    private String Soyad;
    private int id;
    
    public void bilgileri (){
         System.out.println("calisan biligileri:1-ad: "+Ad+"\n2-Soyad: "+Soyad+"\n3-Id:"+id);
    }
        

    public String getAd() {
        return Ad;
    }

    public void setAd(String Ad) {
        this.Ad = Ad;
    }

    public String getSoyad() {
        return Soyad;
    }

    public void setSoyad(String Soyad) {
        this.Soyad = Soyad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Calisan(String Ad, String Soyad, int id) {
        this.Ad = Ad;
        this.Soyad = Soyad;
        this.id = id;
    }

}
