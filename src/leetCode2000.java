public class leetCode2000 {
    public static String reversePrefix(String word, char ch) {
        if(word.indexOf(ch) != -1){
            int c = word.indexOf(ch);
            StringBuilder sb = new StringBuilder(word.substring(0, c+1));
            sb.reverse();
            sb.append(word.substring(word.length() - c+1));
            return sb.toString();
        }

        return word;
    }

    public static void main(String[] args) {
        System.out.println(reversePrefix("abcdefd", 'd'));
    }
}
