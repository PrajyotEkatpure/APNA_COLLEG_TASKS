// import java.util.*; 
 class Subarray {
     void subaarrays(int arr[]){          //Total Subarray = n(n+1)/2 = 42/2=21
        int st=0;
        int maxSum=Integer.MIN_VALUE;
        int minSum=Integer.MAX_VALUE;

        int end=arr.length-1;
        for(st=0;st<=end;st++)
        {
            for(end=st;end<arr.length;end++){
                int sum=0;
                for(int i=st;i<=end;i++){
                    System.out.print(arr[i]+" ");
                    sum=sum+arr[i];
                }
                maxSum=Math.max(maxSum,sum);
                minSum=Math.min(minSum,sum);
            IO.println();

            };
        }
        IO.println(" MAX : "+maxSum+" MIN :"+minSum);
    }
    void main() {
        int arr[]={1,-2,6,-1,3};
       subaarrays(arr); 
    }
}