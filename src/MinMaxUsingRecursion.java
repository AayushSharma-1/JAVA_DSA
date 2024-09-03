public class MinMaxUsingRecursion {
    public static int findMinRec(int A[], int n){
        if (n==1)
            return A[0];

            return Math.max(A[n-1], findMinRec(A, n-1));
    }

    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 5, 6};
        System.out.println(findMinRec(arr, 5));
    }
}
