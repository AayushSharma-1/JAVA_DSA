import java.util.Arrays;

public class LeetCode1828 {
    public static void main(String[] args) {
        int [][] arr1 =  {
                {1,3},
                {3,3},
                {5,3},
            {2,2}
        };
        int [][] arr2 = {
                {2,3,1},
                {4,3,1},
                {1,1,2}
        };
        System.out.println(Arrays.toString(countPoints(arr1, arr2)));
    }
   static public int[] countPoints(int[][] points, int[][] queries) {
        int [] ans = new int[queries.length];

       for (int i = 0; i < queries.length; i++) {
           int c = 0;
           int a = queries[i][0];
           int b = queries[i][1];
           int r = queries[i][2];
           for (int j = 0; j < points.length; j++) {
               int x = points[j][0];
               int y = points[j][1];
               double d = Math.sqrt((Math.pow((a - x), 2) + Math.pow((b-y),2)));
               if(d <= r) {
                   c++;
               }
           }
           ans[i] = c;
       }
       return ans;
    }

}
