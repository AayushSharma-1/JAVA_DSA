public class LeetCode151 {
    public static void main(String[] args) {
        System.out.println(reverseWords("  hello world  "));
    }

    static public String reverseWords(String s) {
        s = s.trim();
        StringBuilder sb = new StringBuilder ();
        int len = s.length();
        int i = len - 1;
        int j = len - 1;
        while(i >= 0){
            if(i !=0 && s.charAt(i) != ' '){
                i--;
            } else {
                if(i != 0 && s.charAt(i + 1) == ' '){
                    i--;
                }
                else if(i == 0){
                    sb.append(s.substring(i, j+1) + ' ');
                    j = --i;
                }
                else {
                    sb.append(s.substring(i+1, j+1).trim() + ' ');
                    j = --i;
                }


            }

        }
        return sb.toString().trim();
    }
}
