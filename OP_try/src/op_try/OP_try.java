/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package op_try;

import java.util.ArrayList;
import java.util.List;
public class OP_try {

    
    public static void main(String[] args) {
        List<Person> arr = new ArrayList<Person>();
        arr.add(new Person("Anas",21 ));
        arr.add(new Person("Ahmed",19 ));
 for (Person person : arr){
     System.out.println(person.getName()+"\n"+person.getAge());
     
    }
 arr.forEach((person) ->{
          System.out.println(person.getName()+"\n"+person.getAge());

    });
}
}

