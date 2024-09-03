import java.util.Arrays;

public class leetCode162 {
    public static void main(String[] args) {
        int [] arr = {6,5,4,3,2,3,2};
        System.out.println(findPeakElement(arr));
    }
    static public int findPeakElement(int[] arr) {

        int start = 1;
        int end = arr.length -2;
        if(arr.length == 1){
            return 0;
        }
        if(arr.length == 2){
            if(arr[0] > arr[1]){
                return 0;
            } else {
                return 1;
            }
        }
        while(start <= end){
            int mid = start  + (end - start) / 2;
            if(arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]){
                return mid;
            }
            if(arr[mid] > arr[mid - 1]){
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }
        return -1;

    }
}
