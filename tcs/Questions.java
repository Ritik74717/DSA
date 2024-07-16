package tcs;

import java.util.Arrays;

public class Questions {
    public static void main(String[] args) {

//        System.out.println(isPrime(19));
        System.out.println(perfectSquare(1));
        primeperfectsum(15);

    }

    public static void primeperfectsum(int n){
        int arr[]= new int[n];
        int powerOfTwo=1;
        int powerOfThree= 1;
        for(int i=0;i<n;i++){
            if(isPrime(i+1)){
                arr[i]=powerOfTwo;
                powerOfTwo=powerOfTwo*2;
            }
            else if(perfectSquare(i+1)){
                arr[i]=powerOfThree;
                powerOfThree=powerOfThree*3;
            }
            else{
                arr[i]=arr[i-1]+arr[i-2];
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[n-1]);
    }

    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static boolean perfectSquare(int n){

        if(n>=0){
            int sr = (int)Math.sqrt(n);
            return ((sr*sr)==n);
        }
        return false;
    }
}
