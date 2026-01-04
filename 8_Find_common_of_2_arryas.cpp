//Find common elements in 2 array
#include<iostream>
using namespace std;

void common(int arr[],int arr2[],int sizeA,int sizeB){
    for(int i=0;i<sizeA;i++){
        for(int j=0;j<sizeB;j++){
            if(arr[i]==arr2[j]){
                cout<<arr[i]<<endl;
            }

        }
    }
}
int main(){
    int n1[]={1,2,3,5,6};
    int n2[]={3,4,6};
    common(n1,n2,5,3);
    return 0;
}