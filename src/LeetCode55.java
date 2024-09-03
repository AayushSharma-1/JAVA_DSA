import java.util.ArrayList;

public class LeetCode55 {
    public static void main(String[] args) {
        System.out.println(canJump(new int[] {2,3,1,1,4}));
    }
    static public boolean canJump(int[] nums) {
        return helper(nums, 0);
    }
    static public boolean helper(int[] nums, int i){
        if(i == nums.length - 1){
            return true;
        }
        for (int j = 1; j <= nums[i]; j++) {
            if(helper(nums, i+j)){
                return true;
            }
        }
        return false;
    }
//    static public int helper2(int[] nums, int i, int count){
//        if(i == nums.length - 1){
////            return 1;
//        }
//        ArrayList<Integer> arr = new ArrayList<>();
//        for (int j = 1; j <= nums[i]; j++) {
//            helper2(nums, i+j, count++);
//        }
//        return ;
    }


