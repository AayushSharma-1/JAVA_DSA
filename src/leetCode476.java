public class leetCode476 {
    public static void main(String[] args) {
//        System.out.println(findComplement(5));
//        System.out.println(Integer.toBinaryString((5 ^ ~0) ^ ~0));
        int no = (int)(Math.log(5)/Math.log(2)) + 1;
        System.out.println(no);
        System.out.println(Integer.toBinaryString(~5 ^ (~0 << no))) ;
//        System.out.println(findComplement());
    }

   static public int findComplement(int num) {
        int n = num ^ ~0;
        return Integer.parseInt(Integer.toBinaryString(n),2);
    }
}
