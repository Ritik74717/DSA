package Sortings;

import static Sortings.BubbleSort.swap;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {10,2,9,6,51,7,1,0,14};
        System.out.println("Before Sorting");
        for(int e : arr){
            System.out.print(e+" ");
        }
        System.out.println();
        System.out.println("After Sorting");
        quickSort(arr,0,arr.length-1);
        for(int e : arr){
            System.out.print(e+" ");
        }
    }
    public static void quickSort(int arr[],int low,int high){
        if(low>=high){
            return;
        }
        int s=low;
        int e =high;
        int mid = s+(e-s)/2;
        int pivot=arr[mid];
        while (s<=e){
            while(arr[s]<pivot){
                s++;
            }
            while (arr[e]>pivot){
                e--;
            }
            if(s<=e){
                swap(arr,s,e);
                s++;
                e--;
            }
        }
        quickSort(arr,low,e);
        quickSort(arr,s,high);
    }
}
