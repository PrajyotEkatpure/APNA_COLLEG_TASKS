import java.util.*; 
class FIndMissingNUumber {
    int missing1(int arr[],int N){//Using Linear Loop O(n)
    int size=arr.length;
    int flag=0;
    
    for(int i=1;i<=5;i++){//Because N=5 menas 1 2 3 4 5 numbers are there
    flag=0;
    for(int j=0;j<arr.length;j++){
        if(arr[j]==i) { flag=1; break;}
    }
    if(flag==0) return i;

    }

return -1;
    }

    void missing2(int arr[],int N)//Using HashMap
    {
        //We wiill  implement in c++
    }


    int missing3(int arr[],int N){//Using Concept of Sum of N natural Numbers  Better but not for N=10^5
    int Msum=N*(N+1)/2;
    int Asum=0;
    for(int i:arr){
        Asum+=i;
    }
        return Msum-Asum;
    }

    int missing4(int arr[],int N){              //Most optimzwed even for N=10^5
        int XORN=0;//xor of number 1 to N
        int XORA=0;//xor of all array ele
        for(int i=0;i<N-1;i++){
            XORA=XORA^arr[i];
            XORN=XORN^i+1;//XOR of 1 to N
        }
        XORN=XORN^N;//BecUSE DURING  loop we only go till N-1 not include N 
        return XORA^XORN;

    }
    void main(String[] args) {
        int arr[]={1,2,3,4};
    //    IO.println(missing1(arr,5));
    // IO.println(missing3(arr,5));
    IO.println(missing4(arr,5));

        
    }
}