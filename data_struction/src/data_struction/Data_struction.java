/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data_struction;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Data_struction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       


        // int --> Integer
        // long --> Long
        // double --> Double

        Integer a = 5;
        int b =6;
        Integer c = b;

        Random random = new Random();
        ArrayList<Integer> list = new ArrayList();
        for (int i = 0; i < 52; i++) {
            list.add(i);
        }

        /*System.out.println(list);

        Collections.shuffle(list);
        System.out.println(list);*/

        Collections.sort(list);
        System.out.println(list);

    }
}

        // TODO code application logic here
