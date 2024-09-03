package SubsetsWithRecursion;

import java.util.ArrayList;

public class Subseq {
    public static void main(String[] args) {
        System.out.println(subsseqRet("", "ulacfd"));
//        subsseqAscii("", "abc");
    }
    static void subsseq(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subsseq(p+ch, up.substring(1));
        subsseq(p, up.substring(1));
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

    static void subsseqAscii(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subsseqAscii(p+ch, up.substring(1));
        subsseqAscii(p, up.substring(1));
        subsseqAscii(p + (ch + 0), up.substring(1));
    }
}
