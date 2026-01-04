#include<iostream>
#include<climits>

using namespace std;
void swap(int arr[],int i,int j){
    int temp;
temp=arr[j];
arr[j]=arr[i];
arr[i]=temp;


}
void minMaxSwap(int arr[],int size){

    int smallest=INT_MAX;
    int largest=arr[0];
    int i=0,j=0;
    int smallIndex,largeIndex;
    for(i=0;i<size;i++){
        if(arr[i]<smallest){
            smallest=arr[i];
            smallIndex=i;
        }
    }

    cout<<smallIndex<<endl;
    for(j=1;j<size;j++){
        if(arr[j]>largest){
            largest=arr[j];
            largeIndex=j;
        }    } 
    cout<<largeIndex<<endl;
    swap(arr,smallIndex,largeIndex);
}

int main(){
    int n[]={10,20,30,40,50,60,70};
    minMaxSwap(n,7);
    for(int i=0;i<7;i++){
        cout<<n[i]<<endl;
    }

    return 0;
}