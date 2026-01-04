import java.util.*; 
public class printReverse {

    void printR(int n){
        if(n==0) return;
        IO.println(n);

        printR(n-1);
    }
     void main(String[] args) {
        printR(10);
        
    }
}