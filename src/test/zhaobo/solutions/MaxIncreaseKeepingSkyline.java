package test.zhaobo.solutions;

import java.util.Arrays;

/**
 * @program: testForLeetcode
 * @description: maxIncreaseKeepingSkyline
 * @author: Mr.Zhao
 * @create: 2018-06-07 15:41
 **/
public class MaxIncreaseKeepingSkyline {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int sum = 0;
        int[] row = new int[50];
        int[] col = new int[50];
        Arrays.fill(row,-1);
        Arrays.fill(col,-1);
        for (int i = 0;i<grid.length;i++){
            for (int k = 0;k<grid[0].length;k++){
                if (row[i] < grid[i][k]) row[i] = grid[i][k];
                if (col[k] < grid[i][k]) col[k] = grid[i][k];
            }
        }
        for (int m = 0;m<grid.length;m++){
            for (int n = 0;n<grid[0].length;n++){
                sum += (row[m] > col[n] ? (col[n] - grid[m][n]) : (row[m] - grid[m][n]));
            }
        }
        return sum;
    }
}
