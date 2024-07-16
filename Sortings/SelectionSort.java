package Sortings;

import static Sortings.BubbleSort.swap;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {10,2,9,6,51,7,1,0,14};
        System.out.println("Before Sorting");
        for(int e : arr){
            System.out.print(e+" ");
        }
        System.out.println();
        System.out.println("After Sorting");
        selectionSort(arr);
        for(int e : arr){
            System.out.print(e+" ");
        }
    }
    public static void selectionSort(int arr[]){
        for(int i=0;i<arr.length;i++){
            int lastIndex = arr.length-i-1;
            int maxIndex = findMaxIndex(arr,0,lastIndex);
            swap(arr,lastIndex,maxIndex);
        }

    }
    public static int findMaxIndex(int arr[],int start,int end){
        int max=start;
        for(int i=start;i<=end;i++){
            if(arr[i]>arr[max]){
                max=i;
            }
        }
        return max;
    }


}
