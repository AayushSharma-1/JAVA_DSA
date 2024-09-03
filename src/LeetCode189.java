import java.util.Arrays;

public class LeetCode189 {
    public static void main(String[] args) {
        rotate2(new int[]{-1,-100,3,99}, 2);
    }
    static public void rotate(int[] nums, int k) {
        int len = nums.length;
        int n = k % len;
        if(n != 0){
            int[] arr = new int[n];
            int[] arr2 = new int[len - n];
            arr = Arrays.copyOfRange(nums, len - n, len);
            arr2 = Arrays.copyOfRange(nums, 0, len - n);
            for (int i = 0; i < arr.length; i++) {
                nums[i] = arr[i];
            }
            for(int i = arr.length; i < nums.length; i++){
                nums[i] = arr2[i - n];
            }
            System.out.println(Arrays.toString(nums));
        }
        System.out.println(Arrays.toString(nums));

    }
    static void rotate2(int [] nums, int k){
     int n = nums.length;
     k = k % n;
     rev(nums, 0 , n- 1);
     rev(nums, 0, k -1);
     rev(nums, k , n- 1);
        System.out.println(Arrays.toString(nums));
    }
    static void rev(int [] arr, int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
