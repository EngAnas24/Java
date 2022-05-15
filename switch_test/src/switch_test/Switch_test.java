/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switch_test;

import java.util.Scanner;

/**
 *
 * @author dell
 */
public class Switch_test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           int monthe = 3;
          
           String month = "";
        switch(monthe){
            case 1:
                month = "jan";
                break;
            case 2:
               
                month = "feb";
                break;
            case 3:
             month = "mar";
             break;
           case 4:
               month = "apr";
               break;
   
               case  5:
                   month = "may";
                   break;
               case 6:
                   month="jun";
                   break;
               case 7:
                   month=" july";
                   break;
               case 8:
                   month= " agust";
                   break;
               case 9:
                   month = "sept";
                   break;
                  
               case 10:
                   month = "octo";
                   break;
               case 11:
                   month = "nov";
                  break;
               case 12:
                   month = "dec";
                   break;
                   default:
                       System.out.println("there is no more than 12 months");
        }
                  
            System.out.println(month);
        
    
            }
    
}
