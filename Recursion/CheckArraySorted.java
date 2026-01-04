import java.util.*; 
public class CheckArraySorted {
    Boolean checkSorted(int arr[],int n,int i){
        if(i==n-1){
            return true;

        }
        if(arr[i]>arr[i+1]){
         return false;        
        }
        return checkSorted(arr,n,i+1);
    
    }

    int checkTarget(int arr[],int n,int target,int i){
        if(i==arr.length)return -1;
        int isFound=checkTarget(arr,n,target,i+1);
        if(isFound!=-1) return isFound;
        if(arr[i]==target) return i;
        return -1;

    }
    void main() {
        int arr[]={10,20,10,40,10,60};
        int n=arr.length;
        // IO.println(checkSorted(arr,n,0) ?"Sorted" :"Not Sorted");
        IO.println(checkTarget(arr,n,10,0));

    }
}