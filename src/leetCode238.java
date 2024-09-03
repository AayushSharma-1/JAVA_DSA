import java.util.Arrays;

public class leetCode238 {
    public static void main(String[] args) {
        int [] arr = {-1,1,0,-3,3};

        System.out.println(Arrays.toString(productExceptSelf(arr)));
    }
    static public int[] productExceptSelf(int[] nums) {
        int [] arr = new int[nums.length];
//        arr[0] = nums[0];
        int c = 1;
        for(int i = 0 ; i < nums.length; i++){
            arr[i] = c;
            c = c *  nums[i];
        }
        c = 1;
        for(int i = nums.length - 1; i>=0; i--){
            arr[i] *= c;
            c *= nums[i];
        }
        return arr;
    }
}
