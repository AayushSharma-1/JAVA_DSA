public class mountainarray {
    public static void main(String[] args) {

    }
    public int peakindex(int [] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            int mid = start + (end - start)/2;
            if(arr[mid] > arr[mid+1]){
                //you are in dec part of array
                // this may be the and, but look at left
                end = mid;
            }
            else{
                start = mid + 1;
            }
        }
        return start ;
    }
}
