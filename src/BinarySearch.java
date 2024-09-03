import java.util.*;
public class BinarySearch {
    public static void main(String[] args) {
     int arr[] = {-5,0,2,36,17,18,22,47,50};
     int ans = binarysearch(arr,18);
        System.out.println(ans);
    }
    static int binarysearch(int[] arr,int target){

        int start =0;
        int end = arr.length - 1;
        while(start<=end){
            int mid = start + (end - start) / 2;
            if(target < arr[mid]){
                end  = mid - 1;

            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
