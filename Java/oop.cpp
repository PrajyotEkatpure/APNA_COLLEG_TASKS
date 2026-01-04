#include <iostream>
#include <bits/stdc++.h>
using namespace std;
class Demo{

public :
int arr[5];
Demo(){
    arr[5]={0};
}
Demo(Demo &d){

    this->arr[5]=d.arr[5];

}
void display(){
    for(int i=0;i<5;i++){
        cout<<arr[i]<<endl;
    }
}
};
int main() {
    // Your code here
Demo d1;
Demo d2(d1);
d2.display();




    return 0;
}