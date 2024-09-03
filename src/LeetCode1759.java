public class LeetCode1759 {
    public static void main(String[] args) {
        System.out.println(countHomogenous("xy"));
    }
    static public int countHomogenous(String s) {
        long sum = 0;
        int temp = 0;
        int i = 0;
        int j = 0;
        while( i < s.length() && j < s.length()){
            if((j < s.length() - 1) && (s.charAt(i) == s.charAt(j + 1))){
                j++;
            } else {
                temp = s.substring(i, j + 1).length();
                sum+=Sum(temp);
                temp = 0;
                i = ++j;
            }
        }
        if (sum > Integer.MAX_VALUE){
            long a = sum % (int)(Math.pow(10, 9) + 7);
            return (int) a;
        }

        return (int) sum;
    }
    static long Sum(long n){
        return (n * (n + 1)) / 2;
    }
}
