package MazeProblems;

public class LeetCode37 {
    public static void main(String[] args) {
        char[][] board = new char[][]
                {{'5','3','.','.','7','.','.','.','.'},
                        {'6','.','.','1','9','5','.','.','.'},
                        {'.','9','8','.','.','.','.','6','.'},
                        {'8','.','.','.','6','.','.','.','3'},
                        {'4','.','.','8','.','3','.','.','1'},
                        {'7','.','.','.','2','.','.','.','6'},
                        {'.','6','.','.','.','.','2','8','.'},
                        {'.','.','.','4','1','9','.','.','5'},
                        {'.','.','.','.','8','.','.','7','9'}};

        if(solve(board)) {
            display(board);
        } else {
            System.out.println("Cannot Solve");
        }

    }
    static boolean solve(char[][] board){
        int n = board.length;
        int row = -1;
        int col = -1;

        boolean emptyLeft = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(board[i][j] == '.'){
                    row = i;
                    col = j;
                    emptyLeft = false;
                    break;
                }
            }
            if(emptyLeft == false){
                break;
            }
        }
        if(emptyLeft == true){
            return true;
            //soduko solved
        }
        //backtrack
        for (int number = 49; number <= 57 ; number++) {
            if(isSafe(board, row, col, (char)number)){
                board[row][col] = (char)number;
                if(solve(board)){
                    return true;
                } else {
                    board[row][col] = '.';
                }
            }
        }
        return false;

    }
    private static void display(char [][] board){
        for(char[] row : board){
            for(int num : row){
                System.out.print((char)num + " ");
            }
            System.out.println();
        }
    }
    static boolean isSafe(char[][] board, int row, int col, char num){
        //check row
        for(int i = 0; i < board.length; i++){
            if(board[row][i] == num){
                return false;
            }
        }

        for(char[] nums: board){
            if(nums[col] == num){
                return false;
            }
        }

        int sqrt = (int)(Math.sqrt(board.length));
        int rowStart = row - row % sqrt;
        int colStart = col - col % sqrt;
        for (int r = rowStart; r < rowStart + sqrt; r++) {
            for(int c = colStart; c < colStart + sqrt; c++){
                if(board[r][c] == num){
                    return false;
                }
            }
        }
        return true;
    }

}
