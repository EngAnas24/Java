/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metod1;

/**
 *
 * @author dell
 */
public class Metod1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int Toplam;
        System.out.println(""+ Masaj_Goster());
        Toplam=Masaj_Goster();
        System.out.println("toplam: "+Toplam);
        System.out.println(Display2("ANAS"));
        Display("aanas");
      
        
    }
    private static int Masaj_Goster(){
        System.out.println("MasajGoster");
        int x = 2;
        int a =3;
        return a+x;
    }
   public  static void Display(String name){
       System.out.println("ur name is "+name);
   }
    public  static String Display2(String name){
      return "ur name is "+name;
   }
}
