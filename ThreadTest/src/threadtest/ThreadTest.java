/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadtest;



/**
 *
 * @author dell
 */

public class ThreadTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  Syn s = new Syn();
  A a = new A(s);
  B b = new B(s);
  Thread thread1 = new Thread(a);
  Thread thread2 = new Thread(b);
  thread1.start();
  thread2.start();
        
    }
    
}
