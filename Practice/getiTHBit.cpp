#include <iostream>
using namespace std;

int getIth(int num, int i) {
    if((num  &(1<<i))==0)
    return 0;  // Simpler way to get the ith bit

    return 1;
}
int setith_0(int num,int i){//if 0 then set to 1 and if 1 then set to 1 as it is
    return (num |(1<<i));
}

int cleariTh(int num,int i){//If 1 then make it to 0 and if 0 remain as it is
    return (num & ~(1<<i));
     

}
int main() {
    int num = 10;  // 1111 in binary
    int i = 1;     // Checking 2nd bit (0-based from right)
    
    // cout << "Bit at position " << i << " is: " << getIth(num, i) << endl;
    // cout<<setith_0(num,i);
        cout<<cleariTh(num,i);

    return 0;
}