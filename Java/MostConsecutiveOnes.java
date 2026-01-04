import java.util.*; 
public class MostConsecutiveOnes {
    int mostones(int arr[]){
        int maxC=Integer.MIN_VALUE;
        int count=1;//intiaize by 1 becaue we aslo count to number itself
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==1 && arr[i+1]==1) count++;
            else count=1;
            maxC=Math.max(maxC,count);
        }
        return maxC;
    }


    void mostones1(){}//Using single checck
    int mostones2(int arr[]){
        int count=0;
        int maxc=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                count++;
                maxc=Integer.max(maxc,count);
            }else
            {
                    count=0;
            }
        }
        return maxc;
    }
    

     void main(String[] args) {
        int arr[]={1,1,0,0,3,4,0,1,1,1,1,0,1,1,1};
        IO.println(mostones2(arr));
    }
}