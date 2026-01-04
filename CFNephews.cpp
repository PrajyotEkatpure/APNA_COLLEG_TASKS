#include <iostream>
#include <bits/stdc++.h>
using namespace std;

int main() {
    // Your code here
    int test;
    cin>>test;
    while(test--){
        int gif,more=0;

        cin>>gif;
if(gif%3!=0){
more=(gif%3);
more=3-more;

}        
cout<<more;

    }
    return 0;
}