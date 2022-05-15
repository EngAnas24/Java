/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object_test;

/**
 *
 * @author dell
 * 
 */
public class Object_test {
  
    public static void main(String[] args) {
        Student S = new Student();
        S.id=23;
        S.name="ANAS";
        S.number=05433055030;
        S.level=2;
        S.apartment="pc";
        
        System.out.println("S_Id : "+ S.id);
                System.out.println("S_name : "+ S.name);
        System.out.println("S_num : "+ S.number);

                System.out.println("S_level : "+ S.level);
        System.out.println("S_major : "+ S.apartment);

        
    }
    
}

