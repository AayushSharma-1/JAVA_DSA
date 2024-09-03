public class leetCode153 {
    public static void main(String[] args) {

    }
    static int search(int [] num, int target){
        int pivot = findPivot(num);
        if(pivot == -1){
            return num[0];
        }
        if(pivot == num.length - 1){
            return num[0];
        }

        return num[pivot + 1];


    }


    static int findPivot(int [] arr){
        int start = 0;
        int end = arr.length -1 ;
        while(start < end){
            int mid = start  + (end - start) / 2;
            if(arr[mid] > arr[mid + 1]){
                return mid;
            } else if (mid < end && arr[mid] < arr[mid - 1]) {
                return mid - 1;

            } else if (mid > start && arr[start] >= arr[mid]) {
                end = mid - 1;
            } else{
                start = mid + 1;
            }


        }
        return  -1;
    }
    static int RBS(int [] arr, int start, int end, int target){

        while(start < end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == target){
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;

            } else {
                end = mid - 1;
            }

        }
        return -1;
    }
}
