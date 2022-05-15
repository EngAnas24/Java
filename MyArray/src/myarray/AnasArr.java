
package myarray;


class AnasList {
    
   int[] arr1 = new int[2];
    public void Add(int number){
        if(arr1[arr1.length-1]==0){
       
            arr1[arr1.length-1]=number;
            
            }
        
       
        else{
            int[] arr2 = new int[arr1.length+1];
            for(int j = 0;j<arr2.length-1;j++){
                arr2[j]=arr1[j];
                
            }
            arr2[arr2.length-1]=number;
        arr1=arr2;
        }
              
        
    }
}
