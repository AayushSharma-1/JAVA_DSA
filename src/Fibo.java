public class Fibo {
    public static void main(String[] args) {
        for(int i = 0 ; i< 50; i++){
            System.out.println(fiboformula(i));
        }
//        System.out.println(fibo(5));
    }

    static int fiboformula(int n){
         return (int) ((1 / Math.sqrt(5)) * (Math.pow((1 + Math.sqrt(5)) / 2, n) - Math.pow((1 - Math.sqrt(5)) / 2, n)));
    }
    static int fibo(int n){
        //base condtion
         if(n < 2){
            return n;
        }

        return fibo(n-1) + fibo(n-2);
    }
}
