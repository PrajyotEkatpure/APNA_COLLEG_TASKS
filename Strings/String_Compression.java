import java.util.*; 
public class String_Compression {
    public static void main(String[] args) {
        String s="aaabbcccd";
        String res="";
        for(int i=0;i<s.length();i++){
            Integer count=1;
            while(i<s.length()-1 && s.charAt(i)==s.charAt(i+1)){
                count++;
                i++;
            }
        res+=s.charAt(i);
        if(count>1) res+=count.toString();
 
        }

        IO.println("Compressed String is "+res);
    }
}