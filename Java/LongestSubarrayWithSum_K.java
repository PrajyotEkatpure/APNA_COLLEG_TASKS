import java.util.*; 
 class LongestSubarrayWithSum_K {
    //Approach 1 O(N^2)
void subaarrays(int arr[],int k){       //We are printing sum           //O(n^2)  //Total Subarray = n(n+1)/2 = 42/2=21
        int st=0;
        int maxSum=Integer.MIN_VALUE;
int len=0;
        int end=arr.length-1;
        for(st=0;st<=end;st++)
        {   int sum=0;
        
            for(end=st;end<arr.length;end++){
                sum=sum+arr[end];
                maxSum=Math.max(maxSum,sum);
                if(sum==k) len=Math.max(len,end-st+1);

            }
        }
        IO.println(" MAX : "+maxSum+"Length :"+len);            //Prints length of subarray whose sum is K.
    }
    void LongestSubarrayWithSum(int arr[]){//If positive and negative exists in array
    

    }
    void main() {
        int arr[]={-2,-3,4,-1,-2,1,5,-3};
        // IO.println("Max Subarray Sum :"+maxSum(arr,7));
        subaarrays(arr,4);

    }
}