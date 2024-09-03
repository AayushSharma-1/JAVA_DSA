public class leetCode762 {
    public static void main(String[] args) {

    }
    public int countPrimeSetBits(int left, int right) {
        int count = 0;
        for(int i = left; i <= right; i++){
            int n = setBits(i);
            if(isPrime(n)){
                count++;
            }
        }
        return count;
    }
    public boolean isPrime(int n){
        if(n <= 1){
            return false;

        }
        int c = 2;
        while(c*c <= n){
            if(n % c == 0){
                return false;
            }
            c++;
        }
        return true;
    }
    public int setBits(int n ){
        int count1 = 0;
        while( n > 0){
            count1++;
//            n-=(n & -n);
            n = n & (n-1);
        }
        return count1;
    }

}
