public class LeetCode198 {
    public static void main(String[] args) {

    }
   static public int rob(int[] nums) {
        int sum = 0;
       for (int i = 0; i < nums.length; i++) {
           if((i & 1) != 1){
               sum = sum + nums[i];
           }
       }
       return sum;
    }
}
