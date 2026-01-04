import java.util.*; 
public class BuySellStock {
    void buySell(int stock[]){
        int buyPrice=stock[0];
        int maxProfit=Integer.MIN_VALUE;
        int profit=0;
        for(int i=1;i<stock.length;i++){
            if(buyPrice<stock[i]){
                profit=stock[i]-buyPrice;
                maxProfit=Math.max(maxProfit,profit);
            }
            buyPrice=Math.min(buyPrice,stock[i]);
        }
        IO.println(maxProfit);
    }
    void main() {
       int arr[]={7,1,5,3,6,10}; 
       buySell(arr);
    }
}