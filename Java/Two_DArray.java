import java.util.*; 
public class Two_DArray {
    public static void main(String[] args) {

        int large=Integer.MIN_VALUE;
        int small=Integer.MAX_VALUE;


        int[][] arr={{1,2},{4,5},{7,8}};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                IO.print(arr[i][j]+" ");
                large=Math.max(large,arr[i][j]);
                small=Math.min(small,arr[i][j]);

            }

            IO.println();
        }
      IO.println("Largest "+large);

      IO.println("Small "+small);  
    }
}