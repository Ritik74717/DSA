package tcs;

import java.util.Arrays;
import java.util.Stack;

public class NearestSmallest {
    public static void main(String[] args) {
        int arr[]={1,6,4,10,2,5};
        nearestSmallest(arr);
        int arr2[]={3,2,1};
        nearestSmallest(arr2);
    }
    public static void nearestSmallest(int arr[]){
        int n= arr.length;
        int output[] = new int[n];
        Stack<Integer> stack = new Stack<>();
        output[0]=-1;
        stack.push(arr[0]);
        for(int i=0;i<n;i++){
            while (stack.size()>0 && stack.peek()>=arr[i]){
                stack.pop();
            }
            if(stack.size()==0){
                output[i]=-1;
            }
            else{
                output[i]=stack.peek();
            }
            stack.push(arr[i]);
        }
        System.out.println(Arrays.toString(output));

    }
}
