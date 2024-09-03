import java.util.Arrays;

public class leetCode73 {
    public static void main(String[] args) {
        int [][] arr = {
                {1,1,1},
                {1,0,1},
                {1,1,1}
        };
        setZeroes(arr);
        System.out.println(Arrays.deepToString(arr));
    }
    public static void setZeroes(int[][] matrix) {
        for(int i = 0; i< matrix.length; i++){
            for(int j = 0; j < matrix[0].length ; j++){
                if(matrix[i][j]!=0){
                    continue;
                }
                else{
                    for(int p = 0; p<matrix[i].length; p++){
                        if(matrix[i][p] == matrix[i][j]){
                            continue;
                        }
                        else{
                            matrix[i][p] = 0;
                        }
                    }
                    for(int p = 0; p<matrix.length; p++){
                        if(matrix[p][j]==matrix[i][j]){
                            continue;
                        }
                        else{
                            matrix[p][j] = 0;
                        }
                    }
                }
            }
        }

    }
}
