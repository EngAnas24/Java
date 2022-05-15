/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heapsorting;

public class HeapSorting {
static int total;
static void Heapify(int [] arr,int i){
    int left = i*2;
    int right = i*2+1;
    int newindex = i;
    if (left<total&&left>arr[i]){
        newindex= left;
        
    }
    if (left<total&&right<arr[i]){
        newindex= right;
        
    }
    if(newindex!=i){
        swap(arr,i,newindex);
        Heapify(arr, newindex);
    }
    }
    static void swap(int [] arr,int a,int b){
        int tmp = arr[a];
        arr[a]= arr[b];
        arr[b]= tmp;
        
    }
    

    public static void main(String[] args) {
        int [] arr = new int[]{39,23,44,76,11};
                    System.out.println("array before sorting:");

        for(int i = 0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
    }
        System.out.println("array after Sorting: ");
        Presorting(arr);
         for(int i = 0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
}
    }
    static void Presorting(int[] arr){
        total = arr.length-1;
        for (int i=total/2;i>=0;i--)
            Heapify(arr,i);
        for (int i =total;i>=0;i--)
        swap(arr,0,i);
        total--;
        Heapify(arr, 1);
        
        }
    
}
