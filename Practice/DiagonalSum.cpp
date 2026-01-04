#include <iostream>
#include <bits/stdc++.h>
using namespace std;
void diagonalSum(int arr[4][4]){
    int sum1=0;
    int sum2=0;
    // for(int i=0;i<4;i++){        o(n^2)
    //     for(int j=0;j<4;j++){
    //         if(i==j){
    //             sum1=sum1+arr[i][j];        //It does not add cell double in oddXodd matrix
    //         }else if(i+j==3){
    //             sum2=sum2+arr[i][j];
    //         }
    //     }
    // }
    int len=4;
    for(int i=0;i<len;i++){
        sum1=sum1+arr[i][i]; //primary diagonal
        if(i != len-1-i){       //To avoid double adding same cell in odd by odd marix
                                //i+j==len-1 So j=len-1-i
        sum2=sum2+arr[i][len-1-i];

        }
    }

    cout<<sum1<<" "<<sum2<<endl;
}
int main() {
    // Your code here
    int arr[4][4]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
    diagonalSum(arr);//now works well for odd by odd {3 X 3} matix also
    return 0;
}