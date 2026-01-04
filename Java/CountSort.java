import java.util.*; 
public class CountSort {
    //It is used only when data size is positive and limited
    //For neagtive data check stackOverflow website
    public static void countsort(int arr[],int n){
        int count[]=new int[n+1];
        for(int i=0;i<n;i++){
            count[arr[i]]++;
        
        }

        for(int j=0,i=0;i<count.length;i++){
            while(count[i]!=0){
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
    }
    public static void main(String[] args) {
     int arr[]={3,6,2,1,8,7,4,5,3,1};
     countsort(arr,10);  
     for(int i:arr){
        IO.print(i+" ");
     } 
    }
}