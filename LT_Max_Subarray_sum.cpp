//Sol 1: Print All Subarrays of any given array
// #include<iostream>
// #include<vector>

// using namespace std;
// void SubarrayPrint(vector<int> v){
//     int end=0,start=0;
//     for(int start=0;start<v.size();start++){
//         for(int end=start;end<v.size();end++){
//             for(int i=start;i<end;i++){
//                 cout<<v[i];
//             }
//             cout<<" ";
//         }

//     }

// }

//Sol 2: Brute Force Approach to max subarray Sum
#include<iostream>
#include<vector>
#include<climits>


using namespace std;
int MaxSubarraySum(vector<int> v){
    int sum,maxsum=INT_MIN,end=0,start=0;
    for(int start=0;start<v.size();start++){
        sum=0;
        for(int end=start;end<v.size();end++){
            sum=sum+v[end];
            maxsum=max(sum,maxsum);
        }

    }
return maxsum;
}

int kanadesAlgo(vector<int> v){
    int sum=0,maxsum=INT_MIN;
    for(int i=0;i<v.size();i++){
        sum=sum+v[i];
        maxsum=max(sum,maxsum);
        if(sum<0){
            sum=0;
        }
    }
    return maxsum;
}
int main(){
    vector<int> v={10,20,30,40,50};
    cout<<MaxSubarraySum(v)<<endl;
        cout<<kanadesAlgo(v);

    return 0;
}