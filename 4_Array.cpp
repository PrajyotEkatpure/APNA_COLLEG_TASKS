//Smallest no  in array
// #include<iostream>
// using namespace std;
// int smallest(int arr[],int size){
//     int temp=arr[0];
//     for(int i=1;i<size;i++){
//         if(arr[i]<temp){
//             temp=arr[i];
//         }
//     }
//     return temp;

// }
// int  main(){
//     int arr[5]={10,3,-76,-3,99};
//     cout<<smallest(arr,5)<<endl;
//     return 0;
// }


//Largest no in array
#include<iostream>
using namespace std;
int largest(int arr[],int size){
    int temp=arr[0];
    //int temp=INT_MAX;
    for(int i=1;i<size;i++){
        if(arr[i]>temp){
            temp=arr[i];
        }
    }
    return temp;

}
int  main(){
    int arr[5]={10,99,-76,-3,99};
    cout<<largest(arr,5)<<endl;
    return 0;
}