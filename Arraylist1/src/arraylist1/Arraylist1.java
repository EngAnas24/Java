
package arraylist1;
 
import java.util.ArrayList;
public class Arraylist1 {

   
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList arr = new ArrayList();
//        int [] arrayvalue = new int[arr.size()];
        int n;
        arr.add(12);
        arr.add("ANAS");
         arr.add(65);
         arr.add(0, 13);
//         arr.remove(1);
         ArrayList arr2 = (ArrayList)arr.clone();
         
        System.out.println(arr.isEmpty());
        System.out.println(arr.contains(11));
        System.out.println(arr);
        System.out.println(arr2);
        System.out.println(arr.size());
        System.out.println(arr.get(2));
        System.out.println(arr.indexOf(13));
        
//arrayvalue = arr.toArray(arrayvalue);
//Object array = arr.toArray();
//        System.out.println(array);

        

        
        
    }
    
}
