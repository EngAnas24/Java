
package atm;


public class Hesap {
      private String Kullancinin_adi;
    private  String parola;
    private double bakiye;

    public Hesap(String Kullancinin_adi, String parola, double bakiye) {
        this.Kullancinin_adi = Kullancinin_adi;
        this.parola = parola;
        this.bakiye = bakiye;
    }

    /**
     * @return the Kullancinin_adi
     */
    public String getKullancinin_adi() {
        return Kullancinin_adi;
    }

    /**
     * @param Kullancinin_adi the Kullancinin_adi to set
     */
    public void setKullancinin_adi(String Kullancinin_adi) {
        this.Kullancinin_adi = Kullancinin_adi;
    }

    /**
     * @return the parola
     */
    public String getParola() {
        return parola;
    }

    /**
     * @param parola the parola to set
     */
    public void setParola(String parola) {
        this.parola = parola;
    }

    /**
     * @return the bakiye
     */
    public double getBakiye() {
        return bakiye;
    }

    /**
     * @param bakiye the bakiye to set
     */
    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }

 public void paraYatirma(double tutar){
     bakiye+=tutar;
              System.out.println("yeni bakiye = "+bakiye);
             }
 public void paraCekme(double tutar){
     if (bakiye-tutar<0){
         
         System.out.println("yeterli bakiyeniz yok..bakiye= "+bakiye);
        
     }
     if (tutar>1500){
         System.out.println("1000 den fazla cekilmez");
         
     }
     else {
         bakiye-=tutar;
         System.out.println("yeni bakiye = "+bakiye);
     }
         
}
}
