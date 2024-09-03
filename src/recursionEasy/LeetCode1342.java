package recursionEasy;

public class LeetCode1342 {
    public static void main(String[] args) {

    }
    public int steps(int n){
        return helper(n,0 );
    }
    private int helper(int num, int steps){
        if(num == 0){
            return 0;
        }
        if(num%2 == 0){
            return helper(num/2, steps+1);
        }
        return helper(num - 1, steps+1);

    }
}
