#include<iostream>
#include<vector>
//Sol 1: Brute Force Approach 

using namespace std;
// vector<int> twoSum(vector<int>& v,int target){
//     vector<int> vec;
//     for(int i=0;i<v.size();i++){
//         for(int j=i+1;j<v.size();j++){
//             if(v[i]+v[j]==target){
//                 vec.push_back(i);
//                 vec.push_back(j);


//                 return vec;
//             }
//         }
//     }
//     return vec;
// }

//Sol 2:         Approach to find  twosum pair
//Works only on sorted array ************IMP************
vector<int> twoSum2(vector<int>& v,int target){
    vector<int> vec;
    for(int i=0;i<v.size();i++){
        int temp=target-v[i];
        if(temp==v[i+1]){
            vec.push_back(i);
            vec.push_back(i+1);
            return vec;
        }
        
    }
}
int main(){
vector<int> v={1,2,4};
// cout<<twoSum(v,6)[0]<<endl;
// cout<<twoSum(v,6)[1];

cout<<twoSum2(v,6)[0]<<endl;
cout<<twoSum2(v,6)[1];

    return 0;
}