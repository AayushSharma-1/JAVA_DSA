public class leetCode1545 {
    public static void main(String[] args) {
        System.out.println(findKthBit(4, 11));
    }
    static public char findKthBit(int n, int k) {
        String sa = ans(n);
//        return (sa);
        return sa.charAt(k-1);
    }
    static public String ans(int n){
        if(n == 1){
            return "0";
        }
        else {
            String s2 = ans(n-1);
            return  s2 + "1" + inverseReverse(s2);
        }
    }

    static public String inverseReverse(String s){
        StringBuilder sb = new StringBuilder();
        for(char c: s.toCharArray()){
            if(c == '1') {
                sb.append('0');
            } else {
                sb.append('1');
            }
        }
        return sb.reverse().toString();
    }

}
