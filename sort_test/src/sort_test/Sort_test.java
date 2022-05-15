/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sort_test;

/**
 *
 * @author dell
 */
import java.util.ArrayList;
import java.util.Collections;
public class Sort_test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i;
        ArrayList<Integer> numes = new ArrayList<Integer>(15);
        for ( i = 1; i < 40;i++){
        numes.add(i);
    }
      
       System.out.println(numes);
        Collections.sort(numes);   
               System.out.println(numes);

           Collections.shuffle(numes);   
               System.out.println(numes);


        // TODO code application logic here
    }
    
}
