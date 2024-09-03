public class LeetCode134 {
    public static void main(String[] args) {
        System.out.println(canCompleteCircuit(new int[] {2,3,4}, new int[] {3,4,3}));
    }
    static public int canCompleteCircuit(int[] gas, int[] cost) {
        int start = 0;
        int i = 0;
        int j = 0;
        int fuel = 0;
        for (int k = 0; k < gas.length; k++) {
            if(cost[k] <= gas[k]){
                fuel = gas[k];
                start = k;
                i = k;
                break;
            }
        }
        fuel = fuel - cost[i];
        j = (++i) % gas.length;

        while(j != start){
            if(cost[(i) % cost.length] <= gas[j % gas.length] + fuel){
                fuel = fuel - cost[(i) % cost.length] + gas[j % gas.length];
                j = ++j % gas.length;
                i = (++i) % gas.length;
            }
        }
    return j;
    }
}
