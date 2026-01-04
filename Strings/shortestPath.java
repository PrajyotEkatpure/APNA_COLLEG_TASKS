import java.util.*; 
public class shortestPath {
    public static void main(String[] args) {
        String name="WNEENESENNN";
        int x=0;
        int y=0;
        for(char c:name.toCharArray()){
            if(c=='E') x++;
            else if(c=='W') x--;
            else if(c=='N') y++;
            else y--;
        }

        int dis=(int)Math.sqrt(x*x+y*y);
        IO.println(dis);
    }
}