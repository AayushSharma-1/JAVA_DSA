public class gfgPrint1toNWithoutLoop {
    public static void printNos(int N)
    {

        //Your code here

        System.out.println(N);
        if (N > 1){
            printNos(N - 1);
        }





    }

    public static void main(String[] args) {
        printNos(10);
    }
}
