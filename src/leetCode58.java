public class leetCode58 {
    public static int lengthOfLastWord(String s) {
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        System.out.println(sb);
        int c = 0;
        for(int i = 0; i < sb.length(); i++) {
            if(sb.charAt(i) != ' '){
                break;
            }
            else{
                c++;
            }
        }
        // char[] ch = sb.toCharArray();
        System.out.println(c);
        String s2 = sb.substring(c);
        System.out.println(s2);

        int d = s2.indexOf(" ");
        if(d == -1){
            return s2.length();
        }
        else{
            return d;
        }


    }

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("a"));
    }
}
