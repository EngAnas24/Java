/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stacktest;

import java.util.Stack;

/**
 *
 * @author dell
 */
public class StackTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Stack<String> stack = new Stack();
        stack.push("Ahmed");
        stack.push("Anas");
        Stack<String> temp = new Stack();
        
        while(!stack.isEmpty()){
            String m = stack.pop();
            System.out.println(m);
            temp.add(m);
        
    }
        
        stack = temp;
//        while(!temp.isEmpty()){
//            String m = temp.pop();
//            System.out.println(m);
//            stack.add(m);
//        }
    }
}
