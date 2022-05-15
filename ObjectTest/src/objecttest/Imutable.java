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
class Imutable {
     public int x;

    @Override
    public String toString() {
        return "Imutable{" + "x=" + x + '}';
    }
    public Imutable(int i){
        x = i;
        
    }
}
