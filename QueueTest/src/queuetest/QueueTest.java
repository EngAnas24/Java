/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queuetest;

import java.util.PriorityQueue;
public class QueueTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       PriorityQueue <Person> queue = new PriorityQueue<>();
      queue.add( new Person("ANAS",21));
      queue.add( new Person("Ahmet",18));
      queue.add( new Person("Mehmet",28));
        while(!queue.isEmpty()){
        System.out.println(queue.poll());
        
        }        
        System.out.println(queue.toString());
    }
    
}
