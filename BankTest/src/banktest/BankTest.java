/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banktest;

/**
 *
 * @author dell
 */
public class BankTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bank bank = new Bank();
        bank.setAccount(21542152);
        bank.setAmount(1000000);
        bank.setName("Ahmed");
        System.out.println(bank.toString());
        
        
        
    }
}

    
        





