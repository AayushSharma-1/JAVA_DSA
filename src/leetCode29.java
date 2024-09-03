public class leetCode29 {
    public static void main(String[] args) {
//        System.out.println(divide(7,-3));
        System.out.println((int)(1 / 3));
    }
    static public int divide(int dividend, int divisor){
        int count = 0;
        int absDivisor = Math.abs(divisor);
        int absDividend = Math.abs(dividend);
        while(absDividend >= absDivisor){
            try{
                count++;
            }
            catch (Exception E){
                count = Integer.MAX_VALUE;
            }

            absDividend-= absDivisor;



        }
        if((divisor > 0) && (dividend > 0)){
            return count;
        }
        if((divisor < 0) || (dividend < 0)){
            count = -count;
            return count;
        }
        if((divisor < 0) && (dividend < 0)){
//            count = -count;
            return count;
        }

        if((dividend == 0)){
            return 0;
        }

        return -1;

    }
}
