public class LeetCode1513 {
    public static void main(String[] args) {
        System.out.println(numSub("101"));
    }
    static public int numSub(String s) {
        long sum = 0;
        int temp = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '1'){
                temp+=1;
            }
            if(s.charAt(i) == '0' || i == s.length() - 1){
                sum+=Sum(temp);
                temp = 0;
            }
        }
        if (sum > Integer.MAX_VALUE){
            long a = sum % (int)(Math.pow(10, 9) + 7);
            return (int) a;
        }

        return (int) sum;

    }
    static long Sum(long n){
        return (n*(n+1)) / 2;
    }
}
