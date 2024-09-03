import java.util.Arrays;

public class LeetCode121 {
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[] {2,4,1}));
    }
   static public int maxProfit(int[] prices) {
        int temp = prices[0];
        int profit = 0;
        for (int i = 0; i < prices.length; i++) {
            if((temp > prices[i]) && (i!=prices.length - 1)){
                temp = prices[i];
            }
            if((i < prices.length - 1) && temp < prices[i+1] ){
                if(profit < (prices[i+1] - temp)){
                    profit = prices[i+1] - temp;
                }
            }

        }
        return profit;
    }
}
