public class LeetCode122 {
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[] {7,1,5,3,6,4}));
    }
    static public int maxProfit(int[] prices) {
        int temp = prices[0];
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if((temp < prices[i])){
                profit += prices[i] - temp;
                temp = prices[i];
            }
        }
        return profit;
    }
}
