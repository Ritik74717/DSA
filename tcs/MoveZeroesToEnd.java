package tcs;

import java.util.Arrays;

public class MoveZeroesToEnd {
    public static void main(String[] args) {
        int arr[]={4,5,0,1,9,0,5,0};
        moveZeroes(arr);
        int arr2[]={0,10,3,0,2,1,0,4,5,0,4,3,0,3,11,2,0};
        moveZeroes(arr2);

    }
    public static void moveZeroes(int arr[]){
        int index=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[index]=arr[i];
                index++;
            }
        }
        for(int i=index;i<arr.length;i++){
            arr[i]=0;
        }
        System.out.println(Arrays.toString(arr));
    }
}
