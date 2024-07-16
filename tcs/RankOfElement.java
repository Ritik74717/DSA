package tcs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RankOfElement {
    public static void main(String[] args) {
        int[] arr = {1,5,8,15,8,25,9};
        rankOfElement(arr);
        int[] arr2 = {20,15,26,2,98,6};
        rankOfElement(arr2);
    }
    public static void rankOfElement(int arr[]){
        int copy[]= Arrays.copyOfRange(arr,0,arr.length);
        Arrays.sort(arr);

//        System.out.println(Arrays.toString(arr));
        int rank=1;
        int output[]=new int[arr.length];
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                continue;
            }
            else{
                map.put(arr[i],rank);
                rank++;
            }
        }
        for(int i=0;i<output.length;i++){
            output[i]=map.get(copy[i]);
        }
        System.out.println(Arrays.toString(output));
    }
}
