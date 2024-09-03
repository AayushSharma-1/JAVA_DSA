public class LeetCode7 {
    public static void main(String[] args) {
        System.out.println(reverse(15678));
    }

    static public int reverse(int x) {
        int ans = 0;
        while(x!=0){
            int digit = (int)(Math.log10(x) + 1);
            x = x / 10;
            if((ans > Integer.MAX_VALUE / 10) || ((ans == Integer.MAX_VALUE/10) && (digit >= Integer.MAX_VALUE % 10))){
                return 0;

            }
            if((ans < Integer.MIN_VALUE / 10) || ((ans == Integer.MIN_VALUE/10) && (digit <= Integer.MIN_VALUE % 10))){
                return 0;

            }
            ans = (ans *10) + digit;
        }

        return ans;
    }

}

