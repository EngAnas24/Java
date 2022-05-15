/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equaltest;

/**
 *
 * @author dell
 */
public class EqualTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Person p = new Person();
         Person p2 = new Person();

        p.name="ANAS";
        p2.name="HANAN";
        String s1="hi there";
                String s2="hi ";
 s2=s2 + "there";
        if (s1.equals(s2))
            System.out.println("they r equal");
        else
            System.out.println("They r not equal");
                    
    }
    
}
