/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadtest1;

/**
 *
 * @author dell
 */
public class PrintTest2 extends Thread{
     public void run(){
    for(int i = 0 ;i<5;i++){
        try {
            Thread.sleep(200);
             System.out.println(i);
        } catch (Exception e) {
            
        }
    }
       
    }
}
