package Sortings;

import static Sortings.BubbleSort.swap;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {10,2,9,6,51,7,1,0,14};
        System.out.println("Before Sorting");
        for(int e : arr){
            System.out.print(e+" ");
        }
        System.out.println();
        System.out.println("After Sorting");
        insertionSort(arr);
        for(int e : arr){
            System.out.print(e+" ");
        }
    }
    public static void insertionSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j-1]>arr[j]){
                    swap(arr,j,j-1);
                }
                else{
                    break;
                }
            }
        }
    }
}
