public class LeetCode3 {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("aab"));
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
            String sb = s.substring(i, j);
            if((s.charAt(i)!=s.charAt(j)) && (!sb.contains((s.charAt(j) + "")))){
                j++;
            } else {
                    int len = s.substring(i,j).length();
                  if(max < len){
                      max = len;
                  }
                  i = j;
                  j++;
            }
        }
        if(max == 0){
            return s.length();
        }
        return max;
    }
}
