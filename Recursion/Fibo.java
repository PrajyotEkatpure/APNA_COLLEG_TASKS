import java.util.*; 
public class Fibo {
    int Nthfibo(int n){
        if(n==0||n==1)
        {
            if(n==0) return 0;
            else return 1;
        }

        return Nthfibo(n-1)+Nthfibo(n-2);
    }
    void main() {
        IO.println(Nthfibo(3));
    }
}