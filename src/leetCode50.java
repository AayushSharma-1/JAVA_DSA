public class leetCode50 {
    public static void main(String[] args) {
        System.out.println(myPow(2,-2));
    }
    static public double myPow(double x, int n){
        if(n == 1){
            return x;
        }
        if(n==-1){
            return 1/x;
        }
        if(n<0){
            return 1/x * myPow(x, n+1);
        }

        if(n%2 == 1){
            return x * myPow(x*x, (n-1) / 2);
        } else{
            return x * myPow(x * x, n /2 );
        }


    }
}
