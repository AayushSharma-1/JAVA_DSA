import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode15 {
    public static void main(String[] args) {
        System.out.println(threeSum(new int[]{-1,0,1,2,-1,-4}));
    }
    static public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if ( i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            int left = i + 1;
            int right = nums.length - 1;

            while(left < right) {
                int target = nums[i] + nums[left] + nums[right];
                if(target > 0){
                    right-- ;
                } else if (target < 0)  {
                    left++;
                }
                else {
                    List<Integer> a = new ArrayList<>();
                    a.add(nums[i]);
                    a.add(nums[left]);
                    a.add(nums[right]);
                    ans.add(a);
                    left++;
                    while(nums[left] == nums[left - 1] && left < right){
                        left++;
                    }
                }
            }


        }
        return ans;
    }
}
