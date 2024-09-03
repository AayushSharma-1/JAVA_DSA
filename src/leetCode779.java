public class leetCode779 {
    public static void main(String[] args) {

        System.out.println(kthGrammar(30, 434991989));
    }

    static public int kthGrammar(int n, int k) {
        if (n == 1){
            return 0;
        }
        int prev_index = (int) ((k + 1) / 2);
        int prev_value = kthGrammar(n-1, prev_index);
        if ((k & 1) == 1){
            return prev_value;
        }
        else{
            return 1 - prev_value;
        }
//        String s = newfun(n, sb).toString();
//        return Integer.parseInt(String.valueOf(s.charAt(k - 1)));

    }

//    static public StringBuilder newfun(int n, StringBuilder s) {
//        if (n == 1) {
//            return s;
//        }
////        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < s.length(); i++) {
//            if (s.charAt(i) == '0') {
//                s.insert(i, "01");
//            } else {
//                s.insert(i, "10");
//            }
//        }
//        return newfun(n - 1, s);
//    }

    static public int indexValue(int n , int k){
        if (n == 1){
            return 0;
        }
        int prev_index = (int) ((k + 1) / 2);
        int prev_value = indexValue(n-1, prev_index);
        if ((k & 1) == 1){
            return prev_value;
        }
        else{
            return 1 - prev_value;
        }

    }
}
