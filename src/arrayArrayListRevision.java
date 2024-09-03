import java.util.Arrays;
import java.util.Scanner;

public class arrayArrayListRevision {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int[] rnos;
//        rnos = new int[5];
//        for (int i = 0; i < rnos.length; i++) {
//            rnos[i] = sc.nextInt();
//        }
//        System.out.println(Arrays.toString(rnos));
//
//        String[] str = new String[4];
//        for (int i = 0; i < str.length; i++) {
//            str[i] = sc.next();
//        }
//        System.out.println(Arrays.toString(str));
//        int [] nums = {3, 34,4, 45};
//        System.out.println(Arrays.toString(nums));
//        change(nums);
//        System.out.println(Arrays.toString(nums));
//        int [][] arr = new int[3][];
        int [][] arr = new int [3][3];
        System.out.println(arr.length);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < arr.length; i++) {

            System.out.println(Arrays.toString(arr[i]));
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
        }
        for(int[] a :arr ){
            System.out.println(Arrays.toString(a));
        }
    }
//    static void change(int[] arr){
//        arr[0] = 99;
//    }
}
