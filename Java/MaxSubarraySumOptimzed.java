import java.util.*; 
class MaxSubarraySumOptimzed {
     int maxSum(int arr[]){
        int sum=0;

        //KANADES ALGORITHM       O(N)

        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
            maxSum=Math.max(maxSum,sum);
            if(sum<0){
                sum=0;
            }

        }
        return maxSum;
    }
    
    void main() {
        int arr[]={-2,-3,4,-1,-2,1,5,-3};
        IO.println("Max Subarray Sum :"+maxSum(arr));
    }
}