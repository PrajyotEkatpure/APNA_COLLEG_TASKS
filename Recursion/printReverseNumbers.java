import java.util.*; 
public class printReverseNumbers {
    void reverse(int n){
         if(n==-1){
            return;       
             }
        IO.println(n);
        reverse(n-1);


       
    }
     void main() {
        reverse(10);
    }
}