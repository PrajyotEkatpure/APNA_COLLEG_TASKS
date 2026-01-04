import java.util.*; 
public class binarySearch {
    static int binary(int arr[],int target){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target) return mid;
            else if(target<arr[mid]) high=mid-1;
            else low=mid+1;
        }
        return -1;
    }
    public static void main(String[] args) {

         int arr[]={10,20,30,40,50,60};
        int key=50;
        System.out.println("Element Found at :"+binary(arr,key));
    }
}