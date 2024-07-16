package tcs;

public class EquilibriumIndex {
    public static void main(String[] args) {
        int arr[]={-7,1,5,2,-4,3,0};
        equilibriumIndex(arr);

    }
    public static void equilibriumIndex(int arr[]){
        int n= arr.length;
        int equiindex=-1;
        int leftsum[] = new int[n];
        int rightsum[]= new int[n];
        int left=0,right=0;
        for(int i=0;i<n;i++){
            leftsum[i]=left;
            left=left+arr[i];
        }
        for(int i=n-1;i>=0;i--){
            rightsum[i]=right;
            right=right+arr[i];
        }
        for(int i=0;i<n;i++){
            if(leftsum[i]==rightsum[i]){
                equiindex=i;
                break;
            }
        }
        System.out.println(equiindex);
    }
}
