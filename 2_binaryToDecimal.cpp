

#include<iostream>
using namespace std;

//Q1 .
//Convert Decimal to Binary 


int main(){

    int rem,num=42;
    int binary=0,pow=1;
    while(num){
        rem=num%2;
        num=num/2;
        binary=binary+pow*rem;
        pow=pow*10;

    }
    cout<<"The Binary is "<<binary<<endl;

    return 0;
}

//Q2.
//Convert the Binary to DEcimal

// int main(){

//     int rem,num=11000000;
//     int deci=0;
//     int pow=1;  //10^0=1
//     while(num){
//        rem=num%10;
//        num=num/10;
//        deci=deci+pow*rem; 
//        pow=pow*2;
//     }
//     cout<<deci;
//     return 0;
// }

//Q3. 
// Convert the octal to binary 
// int main(){

//     int rem,num=177;
//     int binary=0;
//     int pow=1;
//     while(num){
//         rem=num%2;
//         num=num/2;
//         binary=binary+rem*pow;
//         pow=pow*10;

//     }
//     cout<<binary;
//     return 0;
// }