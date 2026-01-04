import java.util.*; 
public class CapitalizeString {
    public static void main(String[] args) {
StringBuilder str = new StringBuilder("hi, my name is prajyot");
        str.setCharAt(0,(char)(str.charAt(0)- 32));
        // for(int i=1;i<str.length();i++){
        //     if(str.charAt(i-1)==' '){
        //         str.setCharAt((i),(char)(str.charAt(i)-32));
        //     }
        // }

         for(int i=1;i<str.length();i++){
            if(str.charAt(i-1)==' '){
                str.setCharAt((i),Character.toUpperCase(str.charAt(i)));
            }
        }
        IO.println("Capitalized String : "+str);
    }
}