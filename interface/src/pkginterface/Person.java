/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkginterface;

/**
 *
 * @author dell
 */
class Person {
  private String name;
  private  String surname;
  private  double number;
    
public void showInformation(){
        System.out.println("Ur name is:  "+name+"\nUr surname is :"+surname+"\n Ur number is = "+number);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSuename() {
        return surname;
    }

    public void setSuename(String suename) {
        this.surname = suename;
    }

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }

    public Person(String name, String suename, double number) {
        this.name = name;
        this.surname = suename;
        this.number = number;
    }
    
      public void fly(){
        System.out.println("can u fly?");
}
    public void swim(){
        System.out.println("can u swim?");
    }
}

