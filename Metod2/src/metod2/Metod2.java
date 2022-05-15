
package metod2;


public class Metod2 {

    
    public static void main(String[] args) {
        // TODO code application logic here
         String isimler[] = {"Baris","ALI"};
         isim(isimler);
         int [] sayilar = {1,2,3,4};
         StrNums(sayilar);
    }
      
    static void isim (String [] isimdizi){
          for (String adlar : isimdizi)
//              Yazdir(adlar);
         System.out.print(adlar+" ");
      }
       static void StrNums (int  [] nums){
          for (int numbers : nums)
//              Yazdir(adlar);
         System.out.print(numbers+" ");
         
      }
//      public static void Yazdir(String isim){
//          System.out.println(isim);
//}
}