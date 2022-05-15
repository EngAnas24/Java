
package refrans;


public class Refrans {

   
    public static void main(String[] args) {
        ANAS i = new ANAS();
        ANAS anas  = new ANAS();
        System.out.println("ur orginal number is  = "+i.x);
        i.addValue(i);
        System.out.println("ur new number is = "+i.x);
        System.out.println("ur orginal name is : "+anas.name);
        anas.addname(anas);
        System.out.println("ur name is : "+anas.name);
     }
    
}
