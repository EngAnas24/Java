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
public  class Syn {
    public synchronized  void Print(int Count){
        for (int i=0;i<=10;i++)
             System.out.println(Count*i);
        try{
            Thread.sleep(500);
        }
        catch ( Exception e ){
           
        }
    }
}
