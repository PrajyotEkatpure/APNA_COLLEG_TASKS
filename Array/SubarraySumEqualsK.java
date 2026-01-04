import java.util.*; 
public class SubarraySumEqualsK {
    int subArrSumEqualsk(int arr[],int target){
        int sum=0;
        int c=0;
        for(int i=0;i<arr.length;i++){
            sum=0;
            for(int j=i;j<arr.length;j++){
                sum+=arr[j];;
                if(sum==target) c++;
            }
        }
        return c;
    }
    int subArrSum(int arr[],int k){
        int sum=0;
        int c=0;
        int prefix[]=new int[arr.length];
        prefix[0]=arr[0];
        for(int j=0,i=1;i<arr.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
            if(prefix[j]==k)c++;
            if(prefix[j]-k)
        }
        return c;
    }
    void main() {
        int arr[]={1,2,3};
        IO.println("The Subarrays with sum 3 are "+subArrSum(arr,3));
    }
}