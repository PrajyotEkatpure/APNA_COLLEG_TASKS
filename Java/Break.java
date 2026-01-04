import java.util.*; 
public class Break {
    public static void main(String[] args) {
        while(true){
            int num;
            num=new Scanner(System.in).nextInt();
            if(num%10!=0) break;
        }
    }
}