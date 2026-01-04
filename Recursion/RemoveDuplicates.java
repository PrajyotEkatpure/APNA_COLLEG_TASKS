import java.util.*; 
public class RemoveDuplicates {
    void removeDuplicates(String s,int index,StringBuilder newStr,boolean map[]){
       //base
        if(index==s.length()) {IO.println(newStr); return;}
        
      //work

        char currChar=s.charAt(index);
        if(map[currChar-'a']==true){
            removeDuplicates(s,index+1,newStr,map);
        }else{
            map[currChar-'a']=true;
            newStr.append(currChar);
            removeDuplicates(s,index+1,newStr,map);

        }

    }
    void main(String[] args) {
        String s="appnnacollege";
        removeDuplicates(s,0,new StringBuilder(""),new boolean[26]);
    }
}