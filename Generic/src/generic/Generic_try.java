
package generic;

import java.awt.DisplayMode;


public class Generic_try {

   
    public static void main(String[] args) {
        Integer [] intarr = {1,2,3,4};
        Character chararr [] = {'A','N','A','S'};
        Double arrdDouble[] = {2.8};
        Ogrenci[] ogrenci = {new Ogrenci("ANAS "), new Ogrenci("Hanan")};
       
        new Generic_try().Display(ogrenci);
        System.out.println("output integer array:  ");
       new Generic_try().Display(intarr);
                System.out.println("output double array:   ");
            new  Generic_try().Display(arrdDouble);
           System.out.println("output character array:   ");
       new Generic_try().Display(chararr);

    }
        public <T> void Display(T[] ANAS){
            for(T element : ANAS){
                System.out.print("  "+element);
                System.out.println("\n");
            }
        }
            
    }
    

