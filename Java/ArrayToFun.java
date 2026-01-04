import java.util.*; 
public class ArrayToFun {
    public static void fun(int arr[]){
        for(int i=0;i<arr.length;i++){
            arr[i]=arr[i]*arr[i];
        }


    }
    public static void main(String[] args) {
        int arr[]={2,3,4,5,6,7};
        fun(arr);
        for(int i:arr){
            System.out.println(i);
        }
    }
}
