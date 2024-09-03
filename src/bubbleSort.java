import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
//        System.out.println("HEllo I am back with DSA");
        int [] arr = {3, 1, 5, 4, 2};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insertion(int [] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j > 0; j--) {
                if(arr[j] < arr [j-1]){
                    swap(arr, j, j-1);

                }else{
                    break;
                }
            }
        }
    }
static void selection(int[] arr){
    for (int i = 0; i < arr.length; i++) {
        int last = arr.length - i - 1;
        int max = get_MaxIndex(arr, 0, last);

        swap(arr, max, last);
    }
}

    private static int get_MaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end ; i++) {
         if(arr[max] < arr[i]) {
             max = i;
         }
        }
        return max;
    }

    static void swap(int[]arr, int first , int last){
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }

    static void bubble(int[] arr){
        for(int i = 0 ; i < arr.length; i++){
            for (int j = 0; j < arr.length-i; j++) {
                // swap if the item is smaller than the previous term

                if (arr[j] < arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                 }
                }
            }
        }
    }

