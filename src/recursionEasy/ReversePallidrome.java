package recursionEasy;

public class ReversePallidrome {
    static int sum = 0;
    static void rev1(int n){
        if(n == 0){
            return;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        rev1(n/10);
    }

    static int rev2(int n){
        int t = 0;
        if(n < 0){
             t = Math.abs(n);
            int digits = (int)(Math.log10(t) + 1);
            int x = helper(t, digits);
            return (-x);
        }
            int digits = (int)(Math.log10(n) + 1);
            int x = helper(n, digits);
            return x;

    }
    static boolean palindrome(int n){
        return n == rev2(n);
    }

    private static int helper(int n, int digits) {
        if(n%10 == n){
            return n;
        }
        int rem = n%10;
        return (int) (rem * Math.pow(10, digits - 1) + helper(n/10, digits -1));
    }

    public static void main(String[] args) {
        System.out.println(rev2(-2147483648));
//        System.out.println(palindrome(1234));
//        System.out.println(Long.MIN_VALUE);
//        System.out.println(sum);
    }

}
