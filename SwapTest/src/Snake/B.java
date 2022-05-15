/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Snake;

/**
 *
 * @author dell
 */
public class B implements  Runnable{
    Sync s ;
    public B(Sync s){
        this.s=s;
    }

    @Override
    public void run() {
        s.Print(5);
    }
    
    
}
