package inheritance1;
public class calisan {
   private String adi;
  private double maas;
  private String departman;

    public calisan(String adi, double maas, String departman) {
        this.adi = adi;
        this.maas = maas;
        this.departman = departman;
    }
    public void yeni_departman(String yeni_departman){
        System.out.println("departman degisitirilyor: ");
        this.departman = yeni_departman;
        System.out.println("yeni_departman: "+ this.departman);
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public double getMaas() {
        return maas;
    }

    public void setMaas(double maas) {
        this.maas = maas;
    }

    public String getDepartman() {
        return departman;
    }

    public void setDepartman(String departman) {
        this.departman = departman;
    }
     public void bilgileriGoster(){
        System.out.println("adin : "+adi+"\nmaasin = "+maas+"\ndepartmanin  : "+departman);
    }
    
}
