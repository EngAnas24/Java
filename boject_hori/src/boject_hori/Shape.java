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
public abstract class Shape {
    int Heigth;
    int Weidth;

    public Shape(int Heigth, int Weidth) {
        this.Heigth = Heigth;
        this.Weidth = Weidth;
    }

 

    public void setHeigth(int Heigth) {
        this.Heigth = Heigth;
    }

    public void setWeidth(int Weidth) {
        this.Weidth = Weidth;
    }
    public abstract double getArea();
    public  abstract double getprimeter();
    public abstract void information();
    public  String shapeName(String Shap_isimi){
        return  " ur Shape is : "+Shap_isimi;
//            public  String shap_na(){
//        return "";
//            }
        
        
    
    
}
}