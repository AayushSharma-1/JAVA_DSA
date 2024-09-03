public class leetCode338 {
    public static void main(String[] args) {
        int n = 6;
//        int []ans = new int
    }
    static int setbits(int n){
        int count = 0;
        while(n > 0){
            count++;
            n = n & (n - 1);
        }
        return count;
    }
}
