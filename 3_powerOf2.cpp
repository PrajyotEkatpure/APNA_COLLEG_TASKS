//WAP to checck number is power of 2 or not
#include<iostream>
using namespace std;
bool is2Power(int n){
    while(n%2==0){
        n=n/2;//// at last value of n will be 1 in case of if it is 2 power
    }
    return n==1;
}
int main(){
int n=65;
if(is2Power(n)){
    cout<<"The number "<<n<<" is power of 2"<<endl;
}
else{
    cout<<"The number "<<n<<" is not power of 2"<<endl;

}
    return 0;
}

