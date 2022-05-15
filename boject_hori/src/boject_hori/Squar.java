/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boject_hori;

/**
 *
 * @author dell
 */
public  class Squar extends Shape {


    public Squar(int Heigth, int Weidth) {
        super(Heigth, Weidth);
    }

    public  double getArea(){
        return Math.pow(Weidth,2);
    }
    public   double getprimeter(){
        return  4*Weidth;
    }
    public  void information(){
            System.out.println("Square's primeter = "+getprimeter()+"\n Square's Area = " +getArea());

    }
 public void shap_name(){
 }
   

    
    }

    
    
    
    

