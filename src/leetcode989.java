import java.util.ArrayList;
import java.util.List;

public class leetcode989 {
    public static void main(String[] args) {
        int [] arr = {9,9,9,9,9,9,9,9,9,9};
        int num = 1;
        System.out.println(addToArrayForm(arr, num));
    }
    public static List<Integer> addToArrayForm(int[] num, int k) {

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i< num.length ; i++) {
            sb.append(Integer.toString(num[i]));
        }
        String s = sb.toString();
        int nums = Integer.parseInt(s);
        nums = nums + k;
        StringBuilder sb1 = new StringBuilder(Integer.toString(nums));
        // sb = Integer.toString(nums);

        List<Integer> list = new ArrayList<>();
        for(int i = 0; i<sb1.length(); i++){
            list.add(sb1.charAt(i) - '0');
        }

        return list;
    }
}