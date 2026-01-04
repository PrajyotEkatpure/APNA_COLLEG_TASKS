#include <iostream>
#include <bits/stdc++.h>
using namespace std;
int expo(int num,int pow){
    int ans=1;
    while(pow){
        if((pow&1)==1){
            ans=ans*num;
        }
        num=num*num;
        pow=pow>>1;//Its imp step
    }
return ans;
}
int main() {
    // Your code here
    int num=3;
    int pow=5;
    cout<<expo(num,pow);
    cout<<~15;

    char ch='Z';
    char lower=(ch | ' ');
    cout<<endl<<ch<<" In Lower Case :"<<(char)(ch|' ');
    return 0;
}