import java.util.*; 

 /*
 
 Given n friends, each one can remain single or can be paired up with some other friend. 
 Each friend can be paired only once. 
 Find out the total number of ways in which friends can remain single or can be paired up.
For n==1 there are 1 ways([A])
for n==2 there are 2 ways ([A,B],[(A,B)])
for n==3 there are 4 ways ([a,b,c] , [a,(b,c)] ,[b,(a,c)], [c,(a,c)] )
 
  */
public class FriendsPairing {
    int friendPair(int n){
        if(n==1 || n==2) return n;

        int single=friendPair(n-1);
        int pair=(n-1)*friendPair(n-2);
        return single+pair;
    }
    void main(String[] args) {
        IO.println("For 3 Frineds :"+friendPair(3));
    }
}