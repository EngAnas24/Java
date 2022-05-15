/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uhc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

/**
 *
 * @author dell
 */
public class Uhc  {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    List<String> al = new ArrayList<String>();
        List<String> al2 = new ArrayList<String>();
        al.add("ahmet");
        al.add(0, "mehmet");
        al.add(0, "ali");
        al.add(0, "veli");
        System.out.println(al);
        System.out.println(al2);
        al2.addAll(al);
        System.out.println(al2);


        al.remove("ali");
        System.out.println("Liste 1 :" + al);
        al2.remove(0);
        System.out.println("Liste 2 :" + al2);
        al2.removeAll(al);
        System.out.println("Liste 2 :" + al2);
    }
    
}
