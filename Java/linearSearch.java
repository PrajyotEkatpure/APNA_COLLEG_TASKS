import java.util.*; 
public class linearSearch {
    public  static int linear(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key) return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60};
        int key=5;
        System.out.println("Element Found at :"+linear(arr,key));

    }
}
