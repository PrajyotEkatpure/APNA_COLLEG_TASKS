import java.util.*; 
public class MergeSort {
    void merge(int arr[],int low,int mid,int high){
        int i=low;
        int j=mid+1;
        int k=low;
        int []temp=new int[arr.length];
        while(i<=mid&&j<=high){
            if(arr[i]<arr[j])
            {temp[k]=arr[i];
            k++;
            i++;

            }
            else {
                temp[k]=arr[j];
                k++;
                j++;
            }

         }
         while(i<=mid){
            temp[k]=arr[i];
            k++;
            i++;
         }
         while(j<=high) {
            temp[k]=arr[j];
            k++;
            j++;
         }

         for(int m=low;m<=high;m++){
            arr[m]=temp[m];
         }

    }
    void printArr(int arr[]){
        for(int ele:arr){
            IO.println(ele);
        }
    }
    void mergeSort(int arr[],int low,int high){
        if(low<high)
    {
        int mid=low+(high-low)/2;
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }
    }
    void main() {
        int arr[]={394,394,426,225,292,132,93,362};
        mergeSort(arr,0,arr.length-1);
        printArr(arr);
    }
}