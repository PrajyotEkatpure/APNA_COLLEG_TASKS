#include<iostream>
using namespace std;
// 1234
// 1234
// 1234
// 1234

// * * * *
// * * * *
// * * * *
// * * * *
void squarePtn(){
    for(int i=0;i<4;i++){
        for(int j=0;j<4;j++){
            cout<<j+1<<" ";

        }
        cout<<"\n";
    }

}

void squarePtn2(){
    int k=1;
    for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            cout<<k++<<" ";

        }
        cout<<"\n";
    }

}
// *
// * *
// * * *
// * * * *
void startPtr(){
    for(int i=0;i<4;i++){
        for(int j=0;j<4;j++){
            if(j<=i){
            cout<<"* ";

            }

        }
        cout<<"\n";
    }


//         for(int i=0;i<4;i++){
//         for(int j=0;j<i+1;j++){
        
//             cout<<"* ";

            

//         }
//         cout<<"\n";
//     }

}

// void printStar(){
//     char ch;
// for(int i=0;i<4;i++){
//     ch='A';///// For printing the characters
//     for(int j=0;j<i+1;j++){
//         cout<<i;
//     }
//     cout<<"\n";
// }

// }

// void printStar(){
//     int ch;
// for(int i=0;i<4;i++){
//     ch=1;///// For printing the characters
//     for(int j=0;j<i+1;j++){
//         cout<<ch;
//         ch++;

// // 1
// // 12
// // 123
// // 1234

//     }
//     cout<<"\n";
// }

// }


// 1
// 21
// 321
// 4321
void printStar(){
    int ch;
    for(int i=0;i<4;i++){
        ch=i+1;
        for(int j=0;j<i+1;j++){
            cout<<ch;
            ch--;
        }
        cout<<endl;
    }
}
void invertedTriangle(){
    int ch;
    for(int i=0;i<4;i++){
        ch=i+1;
        for(int j=0;j<4;j++){
            if(j>=i){
            cout<<ch;

            }
            else{
                cout<<" ";
            }

        }
        cout<<endl;
    }
}

void pyramid(){
    int ch;
    for(int i=0;i<5;i++){
        ch=1;
        for(int j=0;j<9;j++){
            if(j>=5-i && j<=3+i){
                
                     cout<<ch;
                     if(j<4)//here 4 is mid index value till which we will increment ch then will decrement
                     {
                        ch++;
                     }
                     else{
                        ch--;
                     }

            }                        // Use Flag=0 and flag=1 for alternatly printing number  and else space 
                                        // like                     1
                                        //                         1 1
                                        //                        1 3 1
                                        //                       1 3 3 1    
            else{
                cout<<" ";
            }

        }
        cout<<endl;
    }
}


int main(){
    // squarePtn2();  
    // startPtr();  
    // printStar();
    // invertedTriangle();
    pyramid();
    return 0;
}