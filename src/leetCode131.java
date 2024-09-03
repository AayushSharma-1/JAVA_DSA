import java.util.ArrayList;
import java.util.List;

public class leetCode131 {
    public static void main(String[] args) {

    }
//    public List<List<String>> partition(String s) {
//        ArrayList<String> arr = new ArrayList<>();
//        for(String as : subsseqRet("", s)){
//            if(isPallindrome(as)){
//                arr.add(as);
//            }
//        }
////        return ;
//
//    }
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
    static boolean isPallindrome(String s){
        if(s.length() == 1){
            return true;
        }
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        if(s.equals(sb.toString())){
            return true;
        }
        return false;
    }

}
