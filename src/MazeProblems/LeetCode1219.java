package MazeProblems;

public class LeetCode1219 {
    public static void main(String[] args) {
        int[][] gold = {{0,6,0}, {5,8,7}, {0,9,0}};
        System.out.println(getMaximumGold(gold));
    }
    static public int getMaximumGold(int[][] grid) {
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        int sum = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if(grid[i][j]!=0){
                    visited[i][j] = true;
                    sum = Math.max(sum, giveMax(grid, visited, i, j, grid[i][j]));
                    visited[i][j] = false;
                }
            }
        }
        return sum;

    }

    private static int giveMax(int[][] grid, boolean[][] visited, int row, int col, int value) {
        int ans = value;
        if(row < 0 || row > grid.length - 1 || col<0 || col > grid[0].length - 1 || grid[row][col] == 0){
            return value;
        }
        if(col < grid[0].length - 1 && !visited[row][col + 1]){
            visited[row][col + 1] = true;
            ans = Math.max(ans, giveMax(grid, visited, row, col + 1, value + grid[row][col+1]));
            visited[row][col+1] = false;
        }

        if(row < grid.length - 1 && !visited[row + 1][col]){
            visited[row+1][col] = true;
            ans = Math.max(ans, giveMax(grid, visited, row + 1, col, value + grid[row + 1][col]));
            visited[row + 1][col] = false;
        }

        if(row > 0 && !visited[row - 1][col]){
            visited[row- 1][col] = true;
            ans = Math.max(ans, giveMax(grid, visited, row - 1, col, value + grid[row - 1][col]));
            visited[row-1][col] = false;
        }
        if(col > 0 && !visited[row][col - 1]){
            visited[row][col - 1] = true;
            ans = Math.max(ans, giveMax(grid, visited, row, col - 1, value + grid[row][col - 1]));
            visited[row][col - 1] = false;
        }
        return ans;

    }


}
