package SubsetsWithRecursion;

import java.util.ArrayList;

public class leetCode131 {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        
    }

    static ArrayList<String> subsseqRet(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> arr = new ArrayList<>();
            arr.add(p);
            return arr;
        }
        char ch = up.charAt(0);
        ArrayList<String> left =  subsseqRet(p+ch, up.substring(1));
        ArrayList<String> right = subsseqRet(p, up.substring(1));
        left.addAll(right);
        return left;
    }
    static boolean pallindrome(String s){
        StringBuilder sb = new StringBuilder(s);
        StringBuilder sb2 = new StringBuilder();
        sb2 = sb.reverse();
        if(sb.equals(sb2)){
            return true;
        }
        return false;
    }
}
