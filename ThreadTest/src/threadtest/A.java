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
public class A implements Runnable{
Syn s;

    public A(Syn s) {
        this.s = s;
    }
     @Override
    public void run() {
        s.Print(5);
    }
}
