import java.util.*; 
public class Fact {
    public static int facto(int n){
        if(n==0) return 1;
        else return n*facto(n-1);
    }
    public static void main(String[] args) {
        int num;;
        num=new Scanner(System.in).nextInt();
        System.out.println("Factorial of the number "+num+" is "+facto(num));
    }
}