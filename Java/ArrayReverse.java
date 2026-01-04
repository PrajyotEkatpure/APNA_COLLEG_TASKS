import java.util.*; 
public class ArrayReverse {
    public static void reverse(int arr[],int n){

        for(int i=0;i<n/2;i++){
            int temp=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;
        }

    }
    public static void main(String[] args) {
        int n;
        n=new Scanner(System.in).nextInt();
        int arr[]=new int[n];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        reverse(arr,n);
        for(int i=0;i<n;i++) System.out.println(arr[i]+" ");        
    }
}