
public class yazilimci extends Calisan{
    private String diller;
    public yazilimci(String Ad, String Soyad, int id,String diller) {
        super(Ad, Soyad, id);
        this.diller=diller;
    }
    public void islemit_sistemi(String islemit_sistemi){
            System.out.println(getAd()+" "+islemit_sistemi+" ni yukleniyor");
            
    }

    @Override
    public void bilgileri() {
        super.bilgileri(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("bildigi diller : "+diller);
    }
    
    
}
