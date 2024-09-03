public class LeetCode1922 {
    public static void main(String[] args) {
        System.out.println(countGoodNumbers(50));
    }
    static public int countGoodNumbers(long n) {
        long ans = 0;
        long mod = (int)(Math.pow(10,9) + 7);
        long odd = power(5, (n / 2 + n % 2), mod);
        long even = power(4, (n/2), mod);

        return (int)((odd * even) % mod);

    }
    static long power(long base, long power, long mod){
        long ans = 1;
        while (power > 0 )
        {
            if ((power & 1)==1){
                ans = (ans * base) % mod;
            }
            base = (base * base) % mod;
            power = power >> 1;
        }
    return ans;
    }
}

