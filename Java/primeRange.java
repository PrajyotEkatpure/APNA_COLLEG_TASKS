import java.util.*; 
public class primeRange {
    public static boolean prime(int n){
       boolean isPrime=true;
        if(n==1 ||  n==0 ) return false;
        else{
            for(int i=2;i*i<=n;i++){
                if(n%i==0) return false;
            }
        } 
                    return true;

    }
    public static void main(String[] args) {
        int num1=new Scanner(System.in).nextInt();
        int num2=new Scanner(System.in).nextInt();
        for(int i=num1;i<=num2;i++){
            if(prime(i)==true) System.out.println(i);
        }
        
    }
}