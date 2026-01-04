import java.util.*; 

// Bionomial Coefficient = nCr=n!/(n-r)!*(r)!
public class BioCoeffiecient{
    public static int facto(int n){
        if(n==0) return 1;
        else return n*facto(n-1);
    }
    public static void main(String[] args) {
        int n;
        int r;
        n=new Scanner(System.in).nextInt();
        r=new Scanner(System.in).nextInt();


        int bc=facto(n)/(facto(n-r)*facto(r));
        System.out.println("Bio Nomial Coefficient of "+n+"C"+r+" is "+bc);
    }
}