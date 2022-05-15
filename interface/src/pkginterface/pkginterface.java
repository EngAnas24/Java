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
public class pkginterface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Student student = new Student("ANAS", "ALGAHMA", 84436775.0);
       
    student.fly();
    student.swim();
    student.showInformation();
    }
}
