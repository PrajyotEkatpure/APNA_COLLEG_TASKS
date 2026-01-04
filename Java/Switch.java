import java.util.*; 
public class Switch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int mark;
        mark=sc.nextInt();
        switch(mark){
            case 90: System.out.println("Excellent");
            break;
            case 80: System.out.println("Very Good");
            break;
            case 60: System.out.println("Good");
            break;
            default: System.out.println("Better Luck Next Time");
        }        
    }
}