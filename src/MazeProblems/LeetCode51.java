package MazeProblems;

import java.util.ArrayList;
import java.util.List;

public class LeetCode51 {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        List<List<String>> results = new ArrayList<>();
        queens(board, 0, results);
        System.out.println(results);

    }

    static void queens(boolean[][] board, int row, List<List<String>> ans){
        if(row == board.length){
            ans.add(display(board));
            return;
        }
        // placing the queen and checking for every row and col
        for (int col = 0; col < board.length; col++) {
            // place the queen if it is safe
            if(isSafe(board, row, col)){
                board[row][col] = true;
                queens(board, row + 1, ans);
                board[row][col] = false;
            }
        }

    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        //check vertical row
        for(int i = 0; i < row; i++){
            if(board[i][col]){
                return false;
            }
        }

        int maxLeft  = Math.min(row, col);
        for(int i = 1; i <= maxLeft; i++){
            if(board[row - i][col - i]){
                return false;
            }
        }
        int maxRight  = Math.min(row, board.length - col - 1);
        for(int i = 1; i <= maxRight; i++){
            if(board[row - i][col + i]){
                return false;
            }
        }
        return true;
    }

    private static List<String> display(boolean[][] board) {
        List<String> list = new ArrayList<>();
        for(boolean[] row : board) {
            StringBuilder sb = new StringBuilder();
            for(boolean element : row) {
                if (element) {
                    sb.append("Q");
                } else {
                    sb.append(".");
                }
            }
            list.add(sb.toString());
        }
        return list;
    }
}
