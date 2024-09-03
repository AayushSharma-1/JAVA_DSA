import java.util.Arrays;

public class LeetCode80 {
    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[] {0,0,1,1,1,1,2,3,3}));
    }
   static public int removeDuplicates(int[] nums) {
        int len = nums.length;
        if(len <=2 ){
            return len;
        }
        int j = 2;
       for (int i = 2; i < len; i++) {
           if(nums[i] != nums[j-2]){
               nums[j] = nums[i];
               j++;
           }
       }
       System.out.println(Arrays.toString(nums));
       return j;

    }
}
