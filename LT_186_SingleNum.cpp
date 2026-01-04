#include<iostream>
#include<vector>
//Leetcode Que 186


using namespace std;
int singleNum(vector<int>& num){
    int result=0;
for(int i=0;i<num.size();i++){
    result=result^num.at(i);
}
return result;
}
int main(){
vector<int> v={2,3,4,5,3,5,2};
cout<<"O/p : "<<singleNum(v);
    return 0;
}