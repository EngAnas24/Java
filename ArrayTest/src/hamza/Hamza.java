package hamza;
import java.util.Scanner;
public class Hamza {

public class EngelList {
   private int id;
  
public int ar[]=new int[1]; 
    public void add(int id){
       
      int flag=0;
      int i;
      for(i=0;i<ar.length;i++)
          if(ar[i]==0){
            flag=1;
            ar[i]=id;
            break; }
    //  System.out.println(flag); 
       if(flag==0){
           
        int ar1[]=new int[ar.length+1];
        for(i=0;i<ar.length;i++)
            ar1[i]=ar[i];
         
        ar1[ar1.length-1]=id;
        ar=ar1;
        
           
           
       }

       }
}