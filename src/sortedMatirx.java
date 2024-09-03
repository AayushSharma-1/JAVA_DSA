import java.util.Arrays;

public class sortedMatirx {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(Arrays.toString(search(arr,10)));
    }
    // binary search in one row
    static  int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target ){
        while(cStart <= cEnd){
            int mid = cStart + (cEnd - cStart)/2;
            if(matrix[row][mid] == target){
                return new int[]{row, mid};
            }
            if(matrix[row][mid] < target){
                cStart = mid + 1;
            }
            else {
                cEnd = mid - 1;
            }

        }
        return new int[]{-1,-1};
    }
    static int[] search(int[][] matrix, int target){
        int rows = matrix.length;
        int cols = matrix[0].length;

        if(rows == 1){
            return binarySearch(matrix, 0,0,cols-1, target);

        }
        int rstart = 0;
        int rend = rows -1;
        int cmid = cols / 2;
        // run the loop 2 rows are remaining
        while(rstart < (rend -1)){
            int mid = rstart + (rend - rstart)/2;
            if (matrix[mid][cmid] == target){
                return new int[]{mid,cmid};
            }
            if(matrix[mid][cmid] < target){
                rstart = mid;
            }
            else {
                rend = mid ;
            }
        }
        // now we have two rows
        // check whether the target is in the column of two rows
        if (matrix[rstart][cmid] == target){
            return new int[]{rstart,cmid};
        }
        if(matrix[rstart+1][cmid] == target){
            return new int[]{rstart+1, cmid};
        }
        //search in 1st half
        if(target <= matrix[rstart][cmid-1]){
            return binarySearch(matrix,rstart,0,cmid-1,target);
        }
        //search in 2nd half
        if(target >= matrix[rstart][cmid+1] && target<=matrix[rstart][cols - 1]){
            return binarySearch(matrix,rstart,cmid+1,cols-1,target);
        }
        //search in 3rd half
        if(target <= matrix[rstart+1][cmid-1]){
            return binarySearch(matrix,rstart+1,0,cmid-1,target);
        }
        //search in 4th half

        else {
            return binarySearch(matrix,rstart+1,cmid+1,cols-1,target);
        }



        }
}
