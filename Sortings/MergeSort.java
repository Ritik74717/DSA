package Sortings;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {10,2,9,6,51,7,1,0,14};
        System.out.println("Before Sorting");
        for(int e : arr){
            System.out.print(e+" ");
        }
        System.out.println();
        System.out.println("After Sorting");
        arr=mergeSort(arr);
        for(int e : arr){
            System.out.print(e+" ");
        }
    }
    public static int[] mergeSort(int arr[]){
        if(arr.length==1){
            return arr;
        }
        int mid = arr.length/2;
        int left[]= mergeSort(Arrays.copyOfRange(arr,0,mid));
        int right[]=mergeSort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left,right);
    }
    public static int[] merge(int first[],int second[]){
        int[] mix = new int[first.length+second.length];
        int i=0,j=0,k=0;
        while(i<first.length && j< second.length){
            if(first[i]<second[j]){
                mix[k]=first[i];
                i++;
            }
            else{
                mix[k]=second[j];
                j++;
            }
            k++;
        }
        while (i< first.length){
            mix[k]=first[i];
            i++;
            k++;
        }
        while(j< second.length){
            mix[k]=second[j];
            j++;
            k++;
        }
        return mix;
    }
}
