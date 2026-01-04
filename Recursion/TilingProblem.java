import java.util.*; 
/*
            n
+------------------------+
|                        |  2
|                        |
+-------------------------




 */
//Given 2xN floor and tiles of 2x1 we have to place in it
//For  2x0 floor  we have 1 way of placing (i.e. Way of not placing)
//For 2x1 floor we have 1 way (beacue tile size is also 2x1)
//For 2x2 floor we have 2 ways 
//for 2x3 florr we have 3 ways  and so on 

//We have 2 options to place that is verctical and horizontal
//If we place vertically 1 tile the  we can recursicely pplace remmianing 2 x (n-1) floor
//If we place horizontally 2 tiles in paraallel we can recursilly place remianing 2 x (n-2) floor
//And we will add these ways to get answer
public class TilingProblem {
    int tiling(int n){
        if(n==1||n==0) return 1;
        int F_of_N_minus_1=tiling(n-1);
        int F_of_N_minus_2=tiling(n-2);
        return F_of_N_minus_1 + F_of_N_minus_2;

    }


    void main(String[] args) {
        IO.println("For 2 * 3 Floor :"+tiling(3));
                IO.println("For 2 * 4 Floor :"+tiling(4));

        IO.println("For 2 * 5 Floor :"+tiling(5));

        
    }
}