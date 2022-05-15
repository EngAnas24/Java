/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymophisyon;

/**
 *
 * @author dell
 */
public class Polymophisyon {

   
    public static void main(String[] args) {
        A a = new A();
        D d = new D();
        B b  = new B();
        C c = new C();
        d.poly(a);
        d.poly(b);
                d.poly(c);

        
    }
    
}
