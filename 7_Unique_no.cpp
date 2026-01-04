//Unique elemts of array 

/*step 1: Sort array

step 2: Then apply logicc using single loop 

*/
#include<iostream>
using namespace std;
void printUnique(int arr[],int size){
    int temp;
    //Step 1: 
    for(int i=0;i<size;i++){
        for(int j=0;j<size-i-1;j++){
            if(arr[j]>arr[j+1]){
                temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                    }
        }
    }
int count=0;
    //Step 2:
    for(int i=0,j=1;j<size;){
        cout<<arr[i]<<" ";
        while(j<size&&arr[i]==arr[j]){
            j++;
        }
        if(i+1<j){
            count++;
        }
        i=j;    // Update the i and j after sequence of dulicates is ended like 2,2,2
        j=i+1;


    }
cout<<arr[size-1];//Last element remained 
cout<<"No of Duplicates "<<count<<endl;
}
int main(){
int n[7]={10,20,30,10,20,30,40};
printUnique(n,7);
    return 0;
}