
package inheritance1;

class Yonetici extends calisan{
    private int level;

    public Yonetici(int level, String adi, double maas, String departman) {
        super(adi, maas, departman);
        this.level = level;
    }
    public Yonetici(String adi, double maas, String departman) {
        super(adi, maas, departman);
    }
    public void bilgileriGoster(){
        System.out.println("adin : "+getAdi()+"\nmaasin = "+getMaas()+"\ndepartmanin  : "+getDepartman()+" \nur level:"+level);
    }
    
    
    public void zam_yap(int zam_miktari){
        System.out.println("zam : "+zam_miktari);
    }
}
