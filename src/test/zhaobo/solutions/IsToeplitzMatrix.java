package test.zhaobo.solutions;

/**
 * @program: testForLeetcode
 * @description: isToeplitzMatrix
 * @author: Mr.Zhao
 * @create: 2018-06-19 16:59
 **/
public class IsToeplitzMatrix {
    public boolean isToeplitzMatrix(int[][] matrix) {
        for (int m = 0;m < matrix.length;m++){
            for (int n = 0;n < matrix[0].length;n++){
                if (m + 1 < matrix.length && n + 1 < matrix[0].length){
                    if (matrix[m][n] != matrix[m+1][n+1]) return false;
                }
            }
        }
        return true;
    }
}
