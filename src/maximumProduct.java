import java.util.Arrays;

public class maximumProduct {
    public static void main(String[] args) {
        int[] nums = {-100,-98,-1,2,3,4};
        int res = maximumProduct(nums);
        System.out.println(res);
    }
    public static int maximumProduct(int[] nums) {
        //    for(int j = 0; j < nums.length; j++){
        //         if(nums[j] < 0){
        //             nums[j] = Math.abs(nums[j]);
        //         }
        //     }
//         System.out.println(Arrays.toString(nums));

        for (int i = 0; i < nums.length; i++) {
            int last = nums.length - i - 1;
            int maxIndex = getMaxIndex(nums, 0, last);
            swapArray(nums, maxIndex, last);
        }

        int pro = nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3];

        return pro;


    }
   static void swapArray(int [] arr, int first, int end){
        int temp = arr[first];
        arr[first] = arr[end];
        arr[end] = temp;
    }

    private static int getMaxIndex(int[] arr, int start, int last) {
        int max = Math.abs(start);
        for(int i = 0; i< arr.length; i++){
            if((Math.abs(arr[max])) > (Math.abs(arr[i]))){
                max = i;
            }
        }
        return max ;
    }



    }


