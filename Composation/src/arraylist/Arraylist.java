/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylist;

import java.util.ArrayList;

/**
 *
 * @author dell
 */
public class Arraylist {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
 
 
        // al إسمه ArrayList هنا قمنا بإنشاء كائن من الكلاس
        ArrayList al = new ArrayList();
 
        // و عرض عددهم al هنا قمنا بعرض عناصر الكائن
        System.out.println("All elements:       " + al);
        System.out.println("Number of elements: " + al.size() + "\n");
 
        // al هنا قمنا بإضافة 5 عناصر في الكائن
        al.add("A");
        al.add("B");
        al.add("C");
        al.add("D");
        al.add("E");
 
        // و عرض عددهم al هنا قمنا بعرض عناصر الكائن
        System.out.println("All elements:       " + al);
        System.out.println("Number of elements: " + al.size() + "\n");
 
        // رقم 1 index و العنصر الموجود على الـ 'B' هنا قمنا بحذف العنصر الذي يملك القيمة
        al.remove("B");
        al.remove(1);
 
        // و عرض عددهم al هنا قمنا بعرض عناصر الكائن
        System.out.println("All elements:       " + al);
        System.out.println("Number of elements: " + al.size() + "\n");
 
    }
 
}
    
    

