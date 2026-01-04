#include <iostream>
#include <bits/stdc++.h>
using namespace std;
void BinaryString(int n){
        vector<string> old={""};
        for(int i=0;i<n;i++){
            vector<string> neww;
            for(string s:old){
                neww.push_back(s+"0");
                if(s.empty()||s.back()=='0'){
                    neww.push_back(s+"1");
                }
            }
            old=neww;
        }
        for(string s:old){
            cout<<s<<endl;
        }
        
       

    }
int main() {
    string title= "capiTalIze Oe titLe";
    for(char &c:title){
        c=tolower(c);
    }
       string word="";
    title[0]=title[0]-32;
    int start=-1;
      for(int i=1;i<=title.size();i++){
        if(title[i]==' '||i==title.size()){
            if(i-start>2){
            title[start]=title[start]-32;
            }
            start=i+1;
        }
    }
    cout<<title;
    BinaryString(3);
          return 0;
}