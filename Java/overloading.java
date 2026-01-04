import java.util.*; 
public class overloading {
    public static double sum(double a,double b){
        return a+b;
    }

    public static int sum(int a,int b){
        return a+b;
    }
    public static void main(String[] args) {

        System.out.println(sum(19,20));
                System.out.println(sum(19.0,20.0));

    }
}