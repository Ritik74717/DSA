package Sortings;

import static Sortings.BubbleSort.swap;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {10,2,9,6,51,7,1,0,14};
        System.out.println("Before Sorting");
        for(int e : arr){
            System.out.print(e+" ");
        }
        System.out.println();
        System.out.println("After Sorting");
        cyclicSort(arr);
        for(int e : arr){
            System.out.print(e+" ");
        }

    }
    public static void cyclicSort(int arr[]){
        int i=0;
        while(i<arr.length){
            int index=arr[i]-1;
            if(arr[i]!=arr[index]){
                swap(arr,i,index);
            }
            else{
                i++;
            }
        }
    }
}
