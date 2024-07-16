package Sortings;

public class BubbleSort {
    public static void main(String[] args) {

        int[] arr = {10,2,9,6,51,7,1,0,14};
        System.out.println("Before Sorting");
        for(int e : arr){
            System.out.print(e+" ");
        }
        System.out.println();
        System.out.println("After Sorting");
        bubbleSort(arr);
        for(int e : arr){
            System.out.print(e+" ");
        }

    }
    public static void bubbleSort(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length-i;j++){
                if(arr[j-1]>arr[j]){
                    swap(arr,j,j-1);
                }
            }
        }
    }
    public static void swap(int arr[],int start,int end){
        int temp = arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
}
