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
public class Boject_hori {

  public void Shap_name(Shape shap){
      System.out.println(shap.shapeName("this is a random shape"));
  }
    public static void main(String[] args) {
        Squar squar = new Squar(10, 10);
        Ric r = new Ric(4, 8);
        squar.information();
        r.information();
        System.out.println("**********************************");
       Shape shape= new Squar(10, 10);
       shape.getprimeter();
       shape.information();
       shape.getArea();
        System.out.println(shape.shapeName("Squar"));
        System.out.println(shape.shapeName("Rictangular"));

        
    } 
    
}
