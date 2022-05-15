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
class Mutable {
    private int x;
    public Mutable(int i){
        x = i;
        
    }
    public void SetX(int i){
        x = i;
        System.out.println(x);
    }

   
}
