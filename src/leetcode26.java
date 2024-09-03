import java.util.ArrayList;
import java.util.Arrays;

public class leetcode26 {
    public static void main(String[] args) {
        int [] k = {1,1,2};
        System.out.println(removeDuplicates(k));
    }
    public static String removeDuplicates(int[] nums) {
        int k;
        ArrayList<Integer> arr1 = new ArrayList<>();

        for(int i = 0; i<nums.length-1 ; i++){
            if(nums[i] == nums[i+1]){
                arr1.add(nums[i]);
            }
            else{
                arr1.add(nums[i+1]);
            }
        }
        int [] expectedNums = new int[arr1.size()];
        // k = arr.length;
        for(int i = 0; i < expectedNums.length; i++){
            expectedNums[i] = arr1.get(i);
        }
        k = expectedNums.length;
        return Arrays.toString(expectedNums);
    }
}
