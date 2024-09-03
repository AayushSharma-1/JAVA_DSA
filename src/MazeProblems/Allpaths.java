package MazeProblems;

import java.util.Arrays;

public class Allpaths {
    public static void main(String[] args) {
        boolean[][] board =  {
                {true,true, true},
                {true,true, true},
                {true,true, true}
        };

        int [][] path = new int[board.length][board[0].length];
        pathsprint("", board, 0, 0, path, 1);
    }

    static void pathsNoRestrictions(String p, boolean [][] maze, int r, int c){
        if(r == maze.length - 1 && c == maze[0].length - 1){
            System.out.println(p);
            return;
        }
        if(!maze[r][c]){
            return;
        }
        // i am considering this block my path
        maze[r][c] = false;// for backtracking

        if(r < maze.length - 1){
            pathsNoRestrictions(p + 'D', maze,r + 1, c);
        }
        if(c < maze[0].length - 1){
            pathsNoRestrictions(p + 'R', maze, r, c + 1);
        }
        if(r > 0){
            pathsNoRestrictions(p + 'U', maze, r - 1, c);
        }
        if(c > 0){
            pathsNoRestrictions(p + 'L', maze, r, c - 1);
        }
        //  ths line is where the function will be over
        // so before the function gets removed, also remove the changes that were made by that function call

        maze[r][c] = true; // for backtracking
    }
    static void pathsprint(String p, boolean [][] maze, int r, int c, int [][] path, int step){
        if(r == maze.length - 1 && c == maze[0].length - 1){
            path[r][c] = step;
            for(int [] arr : path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }
        if(!maze[r][c]){
            return;
        }
        // i am considering this block my path
        maze[r][c] = false;// for backtracking
        path[r][c] = step;
        if(r < maze.length - 1){
            pathsprint(p + 'D', maze,r + 1, c, path, step + 1);
        }
        if(c < maze[0].length - 1){
            pathsprint(p + 'R', maze, r, c + 1, path, step + 1);
        }
        if(r > 0){
            pathsprint(p + 'U', maze, r - 1, c, path, step + 1);
        }
        if(c > 0){
            pathsprint(p + 'L', maze, r, c - 1, path, step + 1);
        }
        //  ths line is where the function will be over
        // so before the function gets removed, also remove the changes that were made by that function call

        maze[r][c] = true; // for backtracking
    }

}
