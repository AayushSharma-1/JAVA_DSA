public class stringHalvesCheck {
    public static void main(String[] args) {

    }

    public static boolean halvesAreAlike(String s) {
        int c = 0, d = 0;
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        for (int i = 0; i < s.length() / 2; i++) {
            s1.append(s.charAt(i));
            s2.append(s.charAt(i + (s.length() / 2)));

        }
        for (int i = 0; i < s1.length(); i++) {
            char s3 = s1.charAt(i);
            if (s3 == 'A' || s3 == 'E' || s3 == 'I' || s3 == 'O' || s3 == 'U' || s3 == 'a' || s3 == 'e' || s3 == 'i' || s3 == 'o' || s3 == 'u') {
                c++;
            }
        }

        for (int i = 0; i < s2.length(); i++) {
            char s4 = s2.charAt(i);
            if (s4 == 'A' || s4 == 'E' || s4 == 'I' || s4 == 'O' || s4 == 'U' || s4 == 'a' || s4 == 'e' || s4 == 'i' || s4 == 'o' || s4 == 'u') {
                d++;
            }
        }
        return(c==d);
    }
}
