import java.util.Arrays;

public class leetCode704usingRecursion {

    public static int bs(int [] nums, int target, int start, int end){
        if(start >= end){
            return -1;
        }

        int mid = start + (end - start) / 2;

        if(nums[mid] == target){
            return mid;
        }
        else if(nums[mid] < target){
            start = mid + 1;
            return bs(nums, target, start, end);
        }
        else if(nums[mid] > target){
            end = mid-1;
            return bs(nums, target, start, end);
        }
        else{
            return -1;
        }


    }
    public static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        return bs(nums, target, start, end);


    }

    public static void main(String[] args) {
        int [] nums = {-1,0,3,5,9,12};
        int target = 9;
        System.out.println(search(nums, target));
    }

}
