package tcs;

public class SearchInTwoDMatrix {
    public static void main(String[] args) {
        int arr[][]={
                {10,20,30,40},
                {15,25,35,45},
                {27,29,37,48},
                {32,33,39,50}
        };
        searchintwod(arr,4,29);

    }
    public static void searchintwod(int arr[][],int n,int target){
        boolean found = false;
        int j=n-1;
        int i=0;
        while(j>=0 && i<n){
            if(arr[i][j]==target){
                System.out.println("["+i+","+j+"]");
                found=true;
                break;
            }
            else if (target>arr[i][j]){
                i++;
            }
            else{
                j--;
            }
        }
        if(!found){
            System.out.println("Not Found");
        }
    }
}
