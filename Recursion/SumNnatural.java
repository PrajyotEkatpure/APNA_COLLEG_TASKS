import java.util.*; 
public class SumNnatural {
    int sumN(int n){
        if(n==0) return 0;
        return n+sumN(n-1);
    }
    void main(String[] args) {
        IO.println(sumN(10));
        
    }
}