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
public class Bank {
 private double account;
private int amount;
private String Name; 
   

  
   
      


    /**
     * @return the account
     */
    public double getAccount() {
        return account;
    }

    /**
     * @param account the account to set
     */
    public void setAccount(double account) {
        this.account = account;
    }

    /**
     * @return the amount
     */
    public int getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(int amount) {
        this.amount = amount;
    }

    /**
     * @return the Name
     */
    public String getName() {
        return Name;
    }

    /**
     * @param Name the Name to set
     */
    public void setName(String Name) {
        this.Name = Name;
    }
    
    @Override
    public String toString() {
        return "BankTest1{" + "account=" + account + ", amount=" + amount + ", Name=" + Name + '}';
    }
}
