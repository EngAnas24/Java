/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception1;
 class Exception1 {

    public static void main(String[] args) {
        int n=9,i=0;
        try {
            System.out.println(n/i);
            
        }
        catch(ArithmeticException ex){
         //   System.out.println("u cann't divide any number  by zero");
            System.out.println(ex.getMessage());
         
        }
        finally{
            System.out.println("ur program maybe could be wrong or right so reread it ");
        }
    }
    
}
