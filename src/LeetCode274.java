import java.util.Arrays;

public class LeetCode274 {
    public static void main(String[] args) {

    }
    static public int hIndex(int[] citations){
        int len = citations.length;
        int max = 0;
        Arrays.sort(citations);
        for (int i = 0; i < len; i++) {
            if(citations[i] >= len - i){
                max = Math.max(max, len - i);
            }
        }
        return max;
    }
}
