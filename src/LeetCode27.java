import java.util.Arrays;

public class LeetCode27 {
    public static void main(String[] args) {
        System.out.println(removeElement(new int[]{0,1,2,2,3,0,4,2}, 2));
    }
    static public int removeElement(int[] nums, int val) {
        int len = nums.length;
        for(int i = 0; i < nums.length; i++){
            if (nums[i] == val){
                nums[i] = Integer.MAX_VALUE;
                len--;
            }
        }
        Arrays.sort(nums);
        return len;

    }
}
