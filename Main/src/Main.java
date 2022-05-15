

import java.util.Scanner;
public class Main {



    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        String islemleri = "islemler .....:\n"
                + " 1.yazilimlerislemleri "+
                "\n2.yonitici islemleri"
                +"\ncikmaya 'q'ya basin";
        System.out.println(islemleri);
        System.out.println("****************************");
        while(true){
            System.out.println("islemenizi seciniz: ");
                        String islem = input.nextLine();

            if(islem.equals("q")){
                System.out.println("sistemden cikiliyor");
                break;
            }
            else if(islem.equals(1)){
            yazilimci yazi = new yazilimci("ANAS", "ALGAHMA", 9, "c,java");
            String yazilimci_islem = "1. Format At\n"
                                         +"2. Bilgileri Göster\n"
                                         + "Çıkış için q'ya basın";
                System.out.println(yazilimci_islem);
                
            while(true){
                  System.out.print("İşlemi Seçiniz : ");
                    String y_islem = input.nextLine();
                    
                    if (y_islem.equals("q")) {
                        System.out.println("Yazılımcı İşlemlerinden Çıkılıyor...");
                        break;
                    }
                     else if (y_islem.equals("1")){
                        
                        System.out.print("İşletim Sistemi : ");
                        String isletim_sistemi = input.nextLine();
                        yazi.islemit_sistemi(isletim_sistemi);
                        
                    }
                     else if (y_islem.equals("2")){
                        
                        yazi.bilgileri();
                    }
                    else {
                        System.out.println("Geçersiz Yazılımcı İşlemi...");
                    }
            }
            }
                    else if(islem.equals("2")){
                        Yonitici yonitici = new Yonitici("ANAS", "ALGAHMA", 8, 8);
                        String y_islemleri = "yonitici islemleri : "
                                +"\n1.zam yap"+"\n2.bilgileri goster"+"\ncikis icin 'q'ya basin";
                            System.out.println(y_islemleri);
                            while(true){
                                String y_islem = input.nextLine();
                                if(y_islem.equals("q")){
                                    System.out.println("Yoniticinin islemlerinden cikiliyor....");
                                }
                               else if(y_islem.equals("1")){
                                    int zam_Mktari =input.nextInt();
                                    input.nextLine();
                                    yonitici.zamYap(zam_Mktari);
                                }
                               else if(y_islem.equals(2)){
                                   yonitici.bilgileri();
                               }
                                   else {
                        System.out.println("Geçersiz Yönetici İşlemi....");
                    }
                
            } 
        }

                
    
     else {
                System.out.println("Geçersiz İşlem....");
            }
            
            
        }
        
        
    }
}