import java.util.HashMap;
import java.util.Map;

public class LeetCode12 {
    public static void main(String[] args) {
        System.out.println(intToRoman(3479));
    }
    static public String intToRoman(int num){
            int [] arr = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
            String[] ch = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
            StringBuilder sb = new StringBuilder();
            int i = 0;
            while(num > 0){
                if(num >= arr[i]){
                    sb.append(ch[i]);
                    num -=arr[i];
                } else {
                    i++;
                }
            }
            return sb.toString();

    }

}
