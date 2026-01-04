import java.util.Collections; 
import java.util.*;
public class BuiltInSort {
    public static void main(String[] args) {
        Integer arr[]={20,50,10,76,44};
        // Arrays.sort(arr);
        //Sort Particular Part Of Array
        // Arrays.sort(arr,0,3,Collections.reverseOrder());
        for(int i:arr){
            IO.print(i+" ");
        }
        IO.println();
    }
}