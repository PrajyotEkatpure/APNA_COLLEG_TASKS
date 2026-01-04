#include <iostream>
#include <bits/stdc++.h>
using namespace std;

int main() {
    // Your code here
    int a1;
    int b1;
    cout<<"Enter The First Number"<<endl;
    cin>>a1;
    cout<<"Enter the Second Number "<<endl;
    cin>>b1;
    cout<<" Before Swapping "<<a1<<" "<<b1<<endl;

    int temp;
    temp=a1;
    a1=b1;
    b1=temp;

    cout<<" After Swapping "<<a1<<" "<<b1<<endl;



    return 0;
}