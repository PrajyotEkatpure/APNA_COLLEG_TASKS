import java.util.*; 
public class string {
    public static void main(String[] args) {
        // IO.println(args[0]);
        // 3 Ways to Declare the String 
        // 1. 
        char arr[]={'h','e','l','l','o'};
        String name=" Prajyot ";
        String fullName=new String("Prajyot Sandip Ekatpure");
        for(char c:arr) IO.print(c);
        IO.println(name+fullName);      

        IO.println("The Length of The String is "+name.length());  
        IO.println("The character at position 4 is "+ name.charAt(4));
    }

}