public class LeetCode135 {
    public static void main(String[] args) {
        System.out.println(candy(new int[] {1,0,2}));
    }
    static public int candy(int[] ratings){
        int len = ratings.length;
        int [] candy = new int[len];
        for (int i = 1; i < len; i++) {
            if(ratings[i] > ratings[i-1]){
                candy[i] = candy[i-1] + 1;
            }
        }
        for (int i = len - 2; i >= 0; i--) {
            if(ratings[i] > ratings[i+1]){
                candy[i] = Math.max(candy[i], candy[i+1] + 1);
            }
        }
        int candies = 0;
        for (int k : candy){
            candies+= k + 1;
        }
        return candies;

    }
}
