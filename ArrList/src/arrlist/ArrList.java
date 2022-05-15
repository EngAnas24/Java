/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrlist;

import java.util.ArrayList;

/**
 *
 * @author dell
 */
public class ArrList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList arrlist = new ArrayList();
            arrlist.add(12);
            arrlist.add(15);
            arrlist.add("Hi Anas ");
            arrlist.add(4, 40);

        System.out.println("Array = {" + arrlist + "}");

    }
    
}
