import java.util.*; 
public class pattern {
    public static void main(String[] args) {
    for(int i=0;i<5;i++){
        for(int j=0;j<5;j++){
            if(i==j || j<i) System.out.println("*");
        }
        System.out.println("\n");
    }
        
    }
}