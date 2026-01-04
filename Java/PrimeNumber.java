import java.util.*; 
public class PrimeNumber {
    public static void main(String[] args) {
        
        System.out.println("Enter The Number");
        int num=new Scanner(System.in).nextInt();
        long stime=System.nanoTime();
                boolean isPrime=true;
        for(int i=2;i*i<num;i++){           //i*i <n == Math.sqrt(n)
            if(num%i==0) isPrime=false;
        }
        long etime=System.nanoTime();
        System.out.println("Execution Time :"+(etime-stime));
        if(isPrime) System.out.println("Yes ! Its a prime number ");
        else System.out.println("No ! Its not prime number ");
    }
}