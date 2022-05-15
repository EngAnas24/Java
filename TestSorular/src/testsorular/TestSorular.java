/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testsorular;

import java.util.LinkedHashSet;
import java.util.Set;
//tasarimkodlama.com
class TestSorular {
  public static void main(String args[])
  {
    Set s=new LinkedHashSet();
    s.add("1");
    s.add(1);
    s.add(3);
    s.add(2);
    System.out.println(s);
  }
}
