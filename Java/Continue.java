import java.util.*; 
public class Continue {
    public static void main(String[] args) {
        while(true){
            int num;
            num=new Scanner(System.in).nextInt();
            if(num%10==0) 
                    continue;
            System.out.println(num);
        }
    }
}