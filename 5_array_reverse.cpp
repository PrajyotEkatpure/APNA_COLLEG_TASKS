#include<iostream>
using namespace std;
void reverse(int arr[],int size){
    int j=size-1;
    int temp;
    int i=0;
        while(i<j){
            temp=arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
            i++;
            j--;
        }

    

}
int main(){
    int n[]={87,86,45,45,988,34};
    reverse(n,6);
    for(int i=0;i<6;i++){
        cout<<n[i]<<endl;
    }
    return 0;
}
