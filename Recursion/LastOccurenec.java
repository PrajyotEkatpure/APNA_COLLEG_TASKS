import java.util.*; 
public class LastOccurenec {
    int lastocc(int arr[],int target,int i){
        if(i==arr.length) return -1;//Ensures we go to end of array and then start comparing elemnts
        int isfound=lastocc(arr,target,i+1);
        if(isfound==-1 && arr[i]==target) return i;

        return isfound;

    }
   void main(String[] args) {
    int arr[]={10,50,30,50,50};
    IO.println(lastocc(arr,50,0));
        
    }
}