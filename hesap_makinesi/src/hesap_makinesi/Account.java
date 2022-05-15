/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hesap_makinesi;

/**
 *
 * @author dell
 */
public class Account {
  private  String hesapNo;
    private  double bakiye ;
    private  String isim ;
    private  String email;
    private String telefonNo;
    
     public Account(String isim,String email,String telefonNo){
         
         this("biligi yok", 0.0, isim, email,telefonNo);
     }
void bilgileriGoster(){
    System.out.println(this.hesapNo+"\n"+this.isim+"\n"+this.email+"\n"+this.telefonNo+"\n"+this.bakiye);
}

    public Account(String hesapNo,double bakiye,String isim,String email,String telefonNo) {
        this.hesapNo=hesapNo;
        this.bakiye=bakiye;
        this.isim=isim;
        this.email=email;
        this.telefonNo=telefonNo;
      
    
    }
  //   public void display(){
    //    System.out.println(this.hesapNo+"\n"+this.isim);
     //}
     
    /* public Account(){
         this("biligi yok", 0.0, "bilgi yok", "anas.alghaa@gmail.com", "37467467643");
     }
*/
   
public void paraYatirma(double miktar){
    bakiye+=miktar;
    System.out.println("yeni bakiyeniz = "+bakiye);
    }
public void paraCekme(double miktar){
    if(miktar>1500){
        System.out.println("1000 den para cekilmez");
        
    }
    if (bakiye-miktar<0){
        System.out.println("yeterli bakiye yok ..bakiye = "+bakiye);
    }
else {
        bakiye-=miktar;
            System.out.println("yeni bakiye = "+bakiye);
}
}
    /**
     * @return the hesapNo
     */
    public String getHesapNo() {
        return hesapNo;
    }

    /**
     * @param hesapNo the hesapNo to set
     */
    public void setHesapNo(String hesapNo) {
        this.hesapNo = hesapNo;
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

    /**
     * @return the isim
     */
    public String getIsim() {
        return isim;
    }

    /**
     * @param isim the isim to set
     */
    public void setIsim(String isim) {
        this.isim = isim;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the telefonNo
     */
    public String getTelefonNo() {
        return telefonNo;
    }

    /**
     * @param telefonNo the telefonNo to set
     */
    public void setTelefonNo(String telefonNo) {
        this.telefonNo = telefonNo;
    }
      
}
