package permutations;

import java.util.ArrayList;
import java.util.List;

public class PermutationsNum {
    public static void main(String[] args) {
        ArrayList<Integer> ques = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        ques.add(1);
        ques.add(2);
        ques.add(3);
        ques.remove(1);
//        permutation(ans,ques);
    }

    static void permutation(List<List<Integer>> up, List<Integer> temp, int [] nums ){
        if(temp.size() == nums.length){
            up.add(new ArrayList<>(temp));
            return;
        }
        for (int i = 0; i < nums.length; i++){
            if(!temp.contains(nums[i])){
                temp.add(nums[i]);
                permutation(up, temp,nums);
                temp.remove(temp.size() - 1);
            }
        }

    }


}
