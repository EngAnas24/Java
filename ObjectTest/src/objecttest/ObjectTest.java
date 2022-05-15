/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objecttest;

/**
 *
 * @author dell
 */
public class ObjectTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Imutable im = new Imutable(new Integer(5));
        Mutable mu = new Mutable(5);
   im = new Imutable(50);
   mu.SetX(50);
        System.out.println(im);     
        goto
    }
    
}
