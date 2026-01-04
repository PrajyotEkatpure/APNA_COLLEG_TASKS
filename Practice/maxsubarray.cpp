#include <iostream>
#include <bits/stdc++.h>
using namespace std;

int main() {
    // Your code here
    int arr[]={-2,1,-3,4,-1,2,1,-5,4};
        int start=0;
        int end=8;
        int sum=0,maxSum=0;
        for(start=0;start<9;start++){
            for(end=start;end<9;end++){
                sum=0;

                for(int i=start;i<=end;i++){
                sum=sum+arr[i];

                }
                maxSum=max(maxSum,sum);

            }
        }
        cout<<maxSum;
    return 0;
}