public class LeetCode1750 {
    public static void main(String[] args) {
        System.out.println(minimumLength("cabaabac"));
    }
    static public int minimumLength(String s) {
        StringBuilder sb = new StringBuilder(s);
        int i = 0;
        int j = sb.length() -1;
        while(sb.charAt(i) == sb.charAt(j)){
            i = 0;
            j = sb.length() -1;
            while(sb.charAt(i) == sb.charAt(j)){
                    if(sb.length() == 2){
                        return 0;
                    }
                    if(sb.charAt(i+1) == sb.charAt(j)){
                        i++;
                    }
                    if(sb.charAt(i) == sb.charAt(j - 1)) {
                        j--;
                    }
                }
            sb = new StringBuilder(sb.substring(i+1, j));
            }


        return sb.length();
    }
}
