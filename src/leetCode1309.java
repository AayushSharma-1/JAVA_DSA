import java.util.Arrays;

public class leetCode1309 {
    public static void main(String[] args) {
        System.out.println(freqAlphabets("1326#"));
    }
    public static String freqAlphabets(String s) {
        StringBuilder sb = new StringBuilder(s);
        StringBuilder sb2 = new StringBuilder();
        for(int i = 0; i<sb.length()-2;i++){
            if((sb.charAt(i+2)) == ('#')){

                sb2.append(Character.toString(Integer.parseInt(String.valueOf(sb.charAt(i) + sb.charAt(i+1)))+96));
            }
            else{
                sb2.append(Character.toString(Integer.parseInt(String.valueOf(sb.charAt(i)))));
                sb2.append(Character.toString(Integer.parseInt(String.valueOf(sb.charAt(i+1)))));

            }
        }
        return sb2.toString();

    }
}
