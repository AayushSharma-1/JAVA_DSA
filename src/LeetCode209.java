import java.util.Arrays;

public class LeetCode209 {
    public static void main(String[] args) {
        System.out.println(minSubArrayLen(213, new int[] {12,28,83,4,25,26,25,2,25,25,25,12}));
    }
    static public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int total = 0;
        int ans = Integer.MAX_VALUE;
        for (int right = 0; right < nums.length; right++) {
            total += nums[right];
            while(total >= target){
                ans = Math.min(right - left + 1, ans);
                total -= nums[left];
                left++;
            }
        }
        if(ans == Integer.MAX_VALUE){
            return 0;
        } else {
            return ans;
        }
        
    }
}
