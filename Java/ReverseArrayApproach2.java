import java.util.*; 
public class ReverseArrayApproach2 {

    static void reverse(int arr[]){
        int low=0;
        int high=arr.length-1;
        while(low<high){    
            int temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            low++;
            high--;
        }
    }

    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60};
        reverse(arr);
        for(int i:arr){
            System.out.println(i);
        }
    }
}