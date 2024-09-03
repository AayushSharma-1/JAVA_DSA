public class leetCode1518 {
    public static void main(String[] args) {
//        System.out.println(numWaterBottles(9, 3));
        System.out.println(Math.ceil(15 / 4));
        }
   static public int numWaterBottles(int numBottles, int numExchange) {
        int count = 0;
        int first = numBottles;
        while(numBottles >= numExchange){
            numBottles = (int) numBottles / numExchange;
            count += numBottles;
        }
        return first + count;
    }
}
