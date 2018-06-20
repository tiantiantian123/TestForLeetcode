package test.zhaobo.solutions;

/**
 * @program: testForLeetcode
 * @description: flipAndInvertImage
 * @author: Mr.Zhao
 * @create: 2018-06-13 10:30
 **/
public class FlipAndInvertImage {
    public int[][] flipAndInvertImage(int[][] A) {
        for (int m = 0;m<A.length;m++){
            for (int n = 0;n<A[0].length/2;n++){
                int mid = A[m][n];
                A[m][n] = A[m][A[0].length-n-1];
                A[m][A[0].length-n-1] = mid;
            }
            System.out.println("\n");
        }
        for (int k = 0;k<A.length;k++){
            for (int j = 0;j<A[0].length;j++){
                A[k][j] = 1 - A[k][j];
            }
        }
        return A;
    }
}
