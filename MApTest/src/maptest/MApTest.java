/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maptest;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author dell
 */
public class MApTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HashMap <String , String>  map = new HashMap<>();
        map.put("Hi", "هلا");
        map.put("you", "أنت");
        map.put("go", "اذهب");
                
       System.out.println(map.get("Hi"));
              String m = "go ";
              
                    if (  map.containsKey(m)){
                        System.out.println(map.get(m));
                    }
                    else{
                        System.out.println("this word is not Found");
                        
                    }
                    Set<String> s = map.keySet();
                    Iterator<String > it = s.iterator();
                    while(it.hasNext()){
                        System.out.println(it.next());
                    }
                    Collection<String> c = map.values();
                   Iterator<String> it2 = c.iterator();
                   while(it2.hasNext()){
                       System.out.println(it2.next());
                   }
                        
    }
    
}
