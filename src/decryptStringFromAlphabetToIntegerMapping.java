import com.sun.jdi.CharValue;

public class decryptStringFromAlphabetToIntegerMapping {
    public static void main(String[] args) {

    }
    public static String freqAlphabets(String s) {
        StringBuilder s1 = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '#'){
                continue;
            }

            if(s.charAt(i+2)=='#'){
                String temp = String.valueOf(s.charAt(i));
                temp = temp + String.valueOf(s.charAt(i+1));
                int c = Integer.valueOf(temp + 64);
                char ch =  (char) c;
                s1.append(ch);

            }
            String temp = String.valueOf(s.charAt(i));
            int c = Integer.valueOf(temp + 64);
            char ch =  (char) c;
            s1.append(ch);

        }
        return String.valueOf(s1);
    }
}
