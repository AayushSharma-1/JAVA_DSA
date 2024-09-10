public class LeetCode6 {
    public static void main(String[] args) {
        System.out.println(convert("PAYPALISHIRING", 3));
    }
    static public String convert(String s, int numRows) {
        if(numRows == 1){
            return s;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            int temp = 2 * (numRows - 1);
            for (int j = i; j < s.length(); j+=temp) {
                sb.append(s.charAt(j));
                if((i > 0) && (i < numRows - 1) && (j + temp - 2 * i) < s.length()){
                    sb.append(s.charAt(j + temp - 2 * i));
                }
            }
        }
        return sb.toString();
    }
}
