import java.util.*; 
public class Kanade_sAlgo {
    public static void main(String[] args) {
        int arr[]={-1,3,-5,6,3,-7,-3,7};
        int start=0;
        int end = 0;
        int tempstart=0;
        int maxSum=0,currSum=0;
        for(int i=0;i<arr.length;i++){
            currSum=currSum+arr[i];
            if(currSum>maxSum){
                maxSum=currSum;
                start=tempstart;
                end=i;

            }
            if(currSum<0){
            
                currSum=0;
                tempstart=i+1;
            }
        }
        IO.println("Max Subarray Sum : "+maxSum);
        for(int i=start;i<=end;i++){
            IO.print(arr[i]+" ");
        }
    }
}