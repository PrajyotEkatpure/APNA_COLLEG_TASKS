import java.util.*; 
public class printIncrease {
    void printAsc(int n){
        if(n==0) return;
        printAsc(n-1);
        IO.println(n);
    }
     void main(String[] args) {
            printAsc(10);
    }
}