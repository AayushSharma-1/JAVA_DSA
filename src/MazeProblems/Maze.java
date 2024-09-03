package MazeProblems;

import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
        System.out.println(pathcount(3, 7));
//        paths("", 5, 5);
//        System.out.println(pathsRet("", 3, 3));
//        System.out.println(pathsRetDiag("", 3, 3));
        boolean[][] board =  {
            {true,true, true},
            {true,false, true},
            {true,true, true}
        };


//        pathsRestrictions("", board, 0, 0);
    }



    static int pathcount(int r, int c){
        if (r == 1 || c == 1){
            return 1;
        }
        int left = pathcount(r - 1, c);
        int right = pathcount(r, c-1);
        return left + right;

    }

    static void paths(String p, int r, int c){
        if(r == 1 && c == 1){
            System.out.println(p);
            return;
        }
        if(r > 1){
            paths(p + 'D', r- 1, c);
        }
        if(c > 1){
            paths(p + 'R', r, c - 1);
        }
    }

    static ArrayList<String> pathsRet(String p, int r, int c){

        if(r == 1 && c == 1){
            ArrayList<String> ans = new ArrayList<>();
            ans.add(p);
            return ans;
        }

        ArrayList<String> ans = new ArrayList<>();

        if(r > 1){
         ans.addAll(pathsRet(p + 'D', r- 1, c));

        }
        if(c > 1){
            ans.addAll(pathsRet(p + 'R', r, c - 1));
        }
        return ans;
    }

    static ArrayList<String> pathsRetDiag(String p, int r, int c){

        if(r == 1 && c == 1){
            ArrayList<String> ans = new ArrayList<>();
            ans.add(p);
            return ans;
        }

        ArrayList<String> ans = new ArrayList<>();

        if(r > 1 && c > 1){
            ans.addAll(pathsRetDiag(p + 'D', r- 1, c-1));
        }

        if(r > 1){
            ans.addAll(pathsRetDiag(p + 'V', r- 1, c));

        }
        if(c > 1){
            ans.addAll(pathsRetDiag(p + 'H', r, c - 1));
        }
        return ans;
    }

    static void pathsRestrictions(String p, boolean [][] maze, int r, int c){
        if(r == maze.length - 1 && c == maze[0].length - 1){
            System.out.println(p);
            return;
        }
        if(!maze[r][c]){
            return;
        }
        if(r < maze.length - 1){
            pathsRestrictions(p + 'D', maze,r + 1, c);
        }
        if(c < maze[0].length - 1){
            pathsRestrictions(p + 'R', maze, r, c + 1);
        }
    }
}

//palakhanda97@gmail.com