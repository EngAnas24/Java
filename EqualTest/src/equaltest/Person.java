/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equaltest;

import javax.print.attribute.standard.MediaSize.Other;

/**
 *
 * @author dell
 */
public class Person {
    public String name;
//    public String s1 ;
    public boolean equals( Person other ){
        return name.equals(other.name);
    }
    
}
