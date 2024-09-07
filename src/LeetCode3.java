public class LeetCode3 {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }
    static public int lengthOfLongestSubstring(String s) {
        if(s.length() < 1) {
            return 0;
        }
        if(s.length() < 2){
            return 1;
        }
        int i = 0;
        int j = 0;
        int max = 0;
        while(j < s.length()){
            String sb = s.substring(i, j + 1);
            max = Math.max(max,sb.length());
            if(j == s.length() -1){
                break;
            }
            if(i <= j && sb.contains(s.charAt(j + 1) + "")) {
                 i++;
            } else {
                j++;
            }


            }
        if(max == 0){
            return s.length();
        }
        return max;
    }
}
