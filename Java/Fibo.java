import java.util.*; 
public class Fibo {

    
    public static void main(String[] args) {

        
        int first=-1;
        int second=1;

        int third=first+second;
        int count=10;
        while(count>0){
            third=first+second;
            IO.println(third);          
            count=count-1;
            first=second;
            second=third;
        }

        
    }
}