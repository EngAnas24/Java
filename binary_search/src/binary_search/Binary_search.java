/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binary_search;

public class Binary_search {

  
    public static void main(String[] args) {
                    double [] index = {10,20,30,40,50,60};

        int mide;
        int low = 0,high = index.length-1;
        int key=30;
        
        
 for (int i=0;i<index.length;i++){
  
   mide = (low+high)/2;
   if (key> mide){
   low=mide+1;
   
 }
  else  if (key < mide){
       high=mide-1;
       
            System.out.println("ur mide number is :"+ mide);

   }
 else if(key==mide){
      
     System.out.println("ur mide number is :"+ mide);
           }
 }
    }
}
