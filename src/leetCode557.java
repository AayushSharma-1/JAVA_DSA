public class leetCode557 {
    public static String reverseWords(String s) {
        StringBuilder sb1 = new StringBuilder();
        String[] str = s.split(" ");
        int c = 0;
        for(String str2 : str){
            c+=1;
            sb1.append(reverse(str2));
            if(c == str.length){
                continue;
            }
            else{
                sb1.append(" ");
            }

        }
        return sb1.toString();

    }
    public static String reverse(String s){
        StringBuilder sb = new StringBuilder();
        char[] ch = s.toCharArray();
        for(int i = ch.length-1; i>=0; i--){
            sb.append(Character.toString(ch[i]));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("Let's take LeetCode contest"));
    }
}
