import java.util.ArrayList;
import java.util.Arrays;

public class LeetCode350 {
    public static void main(String[] args) {
        int [] arr = {4,9,5};
        int [] arr2 = {9,4,9,8,4};
        System.out.println(Arrays.toString(intersect(arr, arr2)));
    }
   static public int[] intersect(int[] nums1, int[] nums2) {
       Arrays.sort(nums1);
       Arrays.sort(nums2);
       int i = 0;
       int j = 0;
       int k = 0;
       int [] ans = new int[Math.min(nums1.length, nums2.length)];
       while((i < nums1.length) && (j < nums2.length)){
           if(nums1[i] < nums2[j]){
               i++;
           } else if (nums1[i] > nums2[j]) {
                j++;
           } else {
               ans[k] = nums1[i];
               k++;
               i++;
               j++;
           }
       }
       return ans;

    }
}
