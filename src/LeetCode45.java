public class LeetCode45 {
    public static void main(String[] args) {
        System.out.println(jump(new int[] {2, 2, 0, 4}));
    }
    static public int jump(int[] nums) {
        int jumps = 0;
        int curr = 0;
        int far = 0;
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            far = Math.max(far, i + nums[i]);

            if(i == curr){
                jumps++;
                curr = far;
                if(curr >= len - 1){
                    break;
                }
            }
        }
        return jumps;
    }
}
