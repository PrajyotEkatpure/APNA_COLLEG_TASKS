import java.util.*; 
public class BinaryString {
    // void BinaryString(int n){
    //     vector<string> old={""};
    //     for(int i=0;i<n;i++){
    //         vector<string> neww;
    //         for(string s:old){
    //             neww.push_back(s+"0");
    //             if(s.empty()||s.back()=='0'){
    //                 neww.push_back(s+"1");
    //             }
    //         }
    //         old=neww;
    //     }
    //     for(string s:old){
    //         cout<<s<<endl;
    //     }
        
       

    // }
    void printBinaryStrings(int n,int lastDigit,String s){
        if(n==0) 
        {
        IO.println(s);
        return;
        }
        if(lastDigit==0){
        printBinaryStrings(n-1,0,s+"0");
        printBinaryStrings(n-1,1,s+"1");

        }
        else{
            printBinaryStrings(n-1,0,s+"0");
        }

    }
    void main() {
    printBinaryStrings(4,0,"");
        
    }
}