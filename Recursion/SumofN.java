import java.util.*; 
public class SumofN {
    int sum(int n){
        if(n==0){
            return 0;
        }
        return n+sum(n-1);
    }

     void main() {
        IO
        .println(sum(10));
    }
}