import java.util.Arrays;

public class LeetCode75 {
    public static void main(String[] args) {
        int [] arr = {2,0,2,1,1,0};
        sortColors(arr);
        System.out.println(Arrays.toString(arr));
    }
   static public void sortColors(int[] nums) {
        int a = 0;
        int b = 0;
        int c = 0;
       for (int i = 0; i < nums.length; i++) {
           if(nums[i] == 0){
               a++;
           } else if (nums[i] == 1) {
               b++;
           } else{
               c++;
           }

       }
       for (int i = 0; i < a; i++) {
           nums[i] = 0;
       }
       for(int i = 0; i<b; i++){
           nums[i + a] = 1;
       }
       for(int i = 0; i < c; i++){
           nums[i + a + b] = 2;
       }
    }
}
