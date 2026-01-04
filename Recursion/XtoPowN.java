import java.util.*; 
public class XtoPowN {
    int pow(int x,int n ){
        if(n==0) return 1;
        else return x*pow(x,n-1);
    }
    void main() {
        IO.println(pow(2,10)); 
    }
}