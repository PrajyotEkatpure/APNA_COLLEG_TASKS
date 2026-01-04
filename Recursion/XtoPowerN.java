import java.util.*; 
public class XtoPowerN {
    int powXtoN(int x,int n){
        if(n==0) return 1;
        return x*powXtoN(x,n-1);
    }

    int optimized(int X,int n){
        if(n==0) return 1;
        //if n is even : X^n =X^(n/2) * X^(n/2) (n/2+n/2 = n)
        //if n is odd : X^n =X* X^(n/2) * X^(n/2)  (n/2 + n/2 + 1=n (odd))

        return (n%2!=0  ?   optimized(X,n/2)*optimized(X,n/2)*X :   optimized(X,n/2)*optimized(X,n/2));
    }
    void main(String[] args) {
        IO.println(optimized(3,3));
    }
}