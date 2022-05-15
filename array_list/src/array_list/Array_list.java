/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array_list;

/**
 *
 * @author dell
 */
import java.util.ArrayList;
public class Array_list {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add("ahmed");
        al.add("ali");
        al.add("mehmet");
        System.out.println(al.get(1));
                        al.remove(1);

        System.out.println("names are :  "+al);
                System.out.println(al.contains("ahmed"));
                al.set(1, "Anas");
                al.add(2,"Hanoon");
                                al.add(2,"NANO");

               // al.remove(1);
               System.out.println("the number of the name is : "+al.lastIndexOf("mehmet"));
                        System.out.println("names are :  "+al);
 ArrayList al2 = new ArrayList(al);
 al2.add("ANAS AND HANAN FOREVER INSHALLAH");
         System.out.println("names are :  "+al2);


 
 

    }
    
}
