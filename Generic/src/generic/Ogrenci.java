
package generic;


public class Ogrenci {

    private String isim ;

    public Ogrenci(String isim) {
        this.isim = isim;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    @Override
    public String toString() {
        return " the most hardworker are "+isim; //To change body of generated methods, choose Tools | Templates.
    }

    
   
}
