#include<iostream>
using namespace std;
int pow(int x=3,int n=4){ //3^4= ?
    int binary=0;

    int pow=1,rem=0;
    while(n){
        rem=n%2;
        binary=binary+pow*rem;
        n=n/2;
        pow=pow*10;
    }

    int result=1;
    while(binary){
        if(binary%10==1){
            result=result*x;
        }
            x=x*x;
            binary=binary/10;
        
    }
    return result;
    


}
int main(){
cout<<pow();
    return 0;
}
