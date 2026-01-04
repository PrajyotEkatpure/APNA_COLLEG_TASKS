import java.util.*; 
public class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        IO.println("Enter the your string ");
        String str=sc.next();
        Boolean isP=true;
        int n=str.length();
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(n-i-1)) 
              {isP=false;}
            else {isP=true;}
        }
        if(isP) {IO.println("Palindrome");
        }
        else {
            IO.println("Not Palindrome");}
    }
}