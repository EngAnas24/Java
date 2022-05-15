/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array_sort;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author dell
 */
public class Array_sort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        ArrayList<Integer> numes = new ArrayList<Integer>();
        numes.add(90);
        numes.add(20);
        numes.add(10);
        for (Integer i : numes){
                   System.out.println(i);

    }
      

        Collections.sort(numes);   
                for (Integer i : numes){

               System.out.println(i);
                }

           Collections.shuffle(numes); 
                   for (Integer i : numes){

               System.out.println(i);
                   }

        // TODO code application logic here
    }
    
}
