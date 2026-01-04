import java.util.*; 
public class LargestArray {
    public  static int Largest(int arr[]){
        int large=Integer.MIN_VALUE;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>=arr[i+1]) large=Math.max(large,arr[i]);
        }
        return large;
    }

    public static int large(int arr[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest) largest=arr[i];
        }
        return largest;
    }

        public  static int Largest(int arr[]){
        int small=Integer.MAX_VALUE;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<small) small=arr[i];
        }
        return small;
    }
    public static void main(String[] args) {
        int arr[]={101,20,30,99,50,100};
        System.out.println("Largest Element Found  :"+Largest(arr));

    }
}