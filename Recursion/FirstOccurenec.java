import java.util.*; 
public class FirstOccurenec {
    int firstocc(int arr[],int target,int i){
                //Base
        if(i== arr.length) return -1;

        if(arr[i]==target) return i;



        return firstocc(arr,target,i+1);
    }
   void main(String[] args) {
    int arr[]={10,50,30,40,50};
    IO.println(firstocc(arr,50,0));
        
    }
}