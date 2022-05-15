/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boject_hori;


public class Ric extends  Shape{
    
    public Ric(int Heigth, int Weidth) {
        super(Heigth, Weidth);
    }

    public  double getArea(){
        return Heigth*Weidth;
    }
    public   double getprimeter(){
        return 2*Heigth+2*Weidth;
    }
    public  void information(){
            System.out.println("Rictangular's primeter = "+getprimeter()+"\n Rictangular's Area = " +getArea());

    }

  
   
    
}
