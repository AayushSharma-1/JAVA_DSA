public class RotatedBinarySearch {
    public static void main(String[] args) {
        int [] num = {1,2};
        System.out.println(findPivot(num));

//        System.out.println(max);
    }
    static int search(int [] num, int target){
        int pivot = findPivot(num);
        if(pivot == -1){
            System.out.println(RBS(num, 0, num.length - 1,7 ));
        }
        if(num[pivot] == target){
            return pivot;
        }
        if(num[0] <= target){
            return RBS(num, 0, pivot-1, target);
        }

        return RBS(num, pivot+1, num.length-1, target);


    }
    static int findPivot(int [] arr){
        int start = 0;
        int end = arr.length -1 ;
        while(start < end){
            int mid = start  + (end - start) / 2;
            if(arr[mid] > arr[mid + 1]){
                return mid;
            } else if (mid < end && mid != 0 && arr[mid] < arr[mid - 1]) {
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
    static int findPivotWithDuplicate(int [] arr){
        int start = 0;
        int end = arr.length -1 ;
        while(start < end){
            int mid = start  + (end - start) / 2;
            if(arr[mid] > arr[mid + 1]){
                return mid;
            }
            if (mid < end && arr[mid] < arr[mid - 1]) {
                return mid - 1;

            }
            if(arr[mid] == arr[start] && arr[start] == arr[end]){

                if(arr[start] > arr[start + 1]){
                    return start;
                }
                start++;

                if(arr[end] < arr[end - 1]){
                    return end - 1;
                }
                end--;
            }


        }
        return  -1;
    }
}
