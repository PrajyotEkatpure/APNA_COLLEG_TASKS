import java.util.*; 
public class removeDuplicates {
    void remove(String input,int i,StringBuilder str,boolean arr[]){
        if(i==input.length()) return;
        if(!arr[input.charAt(i)-'a']){
            
            str.append(input.charAt(i));
            arr[input.charAt(i)-'a']=true;
        }
        remove(input,i+1,str,arr);

    }
    void main() {
        StringBuilder str=new StringBuilder("");
        boolean arr[]=new boolean[26];
        remove("apnnacollege",0,str,arr);  
        IO.println(str);
    }
}