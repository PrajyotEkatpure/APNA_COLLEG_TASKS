import java.util.*; 
public class CheckSortedArray {
    boolean isSort(int arr[],int i){
        //Base
        if(i==arr.length-1) return true;

        if(arr[i]>arr[i+1]) return false;
        return isSort(arr,i+1);
    } 
     void main(String[] args) {
        int arr[]={10,20,40,60,70,80};
        IO.println(isSort(arr,0));
    }
}