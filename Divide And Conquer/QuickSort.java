import java.util.*; 
public class QuickSort {
    int partition(int arr[],int st,int end){
        int j=st-1;
        int pivot=arr[end];
        for(int i=st;i<end;i++){
            if(arr[i]<=pivot){
                j++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        j++;
        int temp=arr[end];
        arr[end]=arr[j];
        arr[j]=temp;
        return j;

    }
    void quickSort(int arr[],int st,int end ){
        if(st<end){
            int pivot=partition(arr,st,end);
            quickSort(arr,st,pivot-1);
            quickSort(arr,pivot+1,end);
        }
    }
    void printArr(int arr[]){
        for(int i:arr){
            IO.println(i);
        }
    }
    void main() {
        int arr[]={10,27,1,34,34,89};
        quickSort(arr,0,arr.length-1);
        printArr(arr);
    }
}