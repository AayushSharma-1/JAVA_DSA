import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode40 {
    public static void main(String[] args) {
        int[] arr = {14,6,25,9,30,20,33,34,28,30,16,12,31,9,9,12,34,16,25,32,8,7,30,12,33,20,21,29,24,17,27,34,11,17,30,6,32,21,27,17,16,8,24,12,12,28,11,33,10,32,22,13,34,18,12};
        List<List<Integer>> ans = combinationSum22(arr, 27);
        for (List<Integer> list : ans) {
            System.out.println(list);
        }
    }

    static public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        List<List<Integer>> outer = new ArrayList<>();


        outer.add(new ArrayList<>());
        for (int num : candidates) {
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        List<List<Integer>> ans = new ArrayList<>();
        for (List<Integer> list : outer) {
            int sum = list.stream().mapToInt(Integer::valueOf).sum();
            if (sum == target) {
                ans.add(list);
            }
//            System.out.println(list);
        }
        return ans;
    }

    static List<List<Integer>> combinationSum22(int[] arr, int target) {
        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();

        outer.add(new ArrayList<>());
        int start = 0;
        int end = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > target){
                break;
            }
            start = 0;
            // if my current and previous element is same  s  = e + 1'
            if (i > 0 && arr[i] == arr[i - 1]) {
                start = end + 1;
            }
            end = outer.size() - 1;
            int n = outer.size();
            for (int j = start; j < n; j++) {
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                int sum = internal.stream().mapToInt(Integer::valueOf).sum();
                outer.add(internal);
                if(sum == target){
                    ans.add(internal);
                }
           }
        }
//        return outer;
//        List<List<Integer>> ans = new ArrayList<>();
//        for (List<Integer> list : outer) {
//            int sum = list.stream().mapToInt(Integer::valueOf).sum();
//            if (sum == target) {
//                ans.add(list);
//            }
////            System.out.println(list);
//        }
        return ans;
    }

}