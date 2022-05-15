/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quicksort.implimintation;


public class QuickSortImplimintation {
private static void QuickSorting(int[] arr,int left ,int right){
    int index=partition(arr ,left , right);
    if (left<index-1)
        QuickSorting(arr, left, index-1);
    if(index<right)
        QuickSorting(arr,index,right);
}

private static int partition(int arr[], int left ,int right){
    int pivote = arr[(left+right)/2];
    while(left<=right){
        while(arr[left]<pivote)left++;
        while (arr[right]>pivote)right--;
        if (left<=right){
            int tmp = arr[left];
            arr[left]=arr[right];
            arr[right]=tmp;
            left++;
            right--;
        }
    }
                return left;

}

    
    public static void main(String[] args) {
        
        int [] arr = new int []{1,7,5,6,8,9};   
        QuickSorting(arr, 0, arr.length-1);
for (int i = 0 ;i<arr.length;i++)
System.out.print(arr[i]+" "+" ,");
    
    }
    
}
