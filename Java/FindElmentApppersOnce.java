import java.util.*; 
class FindElmentApppersOnce{
    int findonce(int arr[]){        //Nested approach O(n^2)
        for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]) count++;
                
            }
            if(count==1) return arr[i];
        }
        return -1;
    }

    int findonce1(int arr[]){//O(3n) Using Hash  Array
    int hashSize=0;
    for(int i=0;i<arr.length;i++){
        hashSize=Math.max(hashSize,arr[i]);
        
    }
    int hashh[]=new int[hashSize];
    for(int i=0;i<hashSize;i++){
        hashh[arr[i]]++;
    }

    for(int i=0;i<arr.length;i++){
        if(hashh[arr[i]]==1) return arr[i];
    }
return -1;
    }


    // void findonce3(int arr[]){//O(n log M)+O(n/2 + 1) Using Map
    // map<long long,int> mp;
    // for(int i:arr){                // O(n log M)
    //     mp[i]++;
    // }

    // for(auto it:mp){
    //     if(it.second==1) return it.first;     //  O(n/2)+1 time as well space
    // }



    // }
    int findonce4(int arr[]){//Using XOR Operation
    int XOR=0;
    for(int i:arr){
        XOR=XOR^i;
    }
    return XOR;
    }
void main() {
    int arr[]={1,2,1,3,4,3,4};
    IO.println(findonce4(arr));
        
    }
}