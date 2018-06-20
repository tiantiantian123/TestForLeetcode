package test.zhaobo.solutions;

/**
 * @program: testForLeetcode
 * @description: peakIndexInMountainArray
 * @author: Mr.Zhao
 * @create: 2018-06-19 09:26
 **/
public class PeakIndexInMountainArray {
    public int peakIndexInMountainArray(int[] A) {
        if (A.length < 3) return -1;
        else {
            for (int i = 1;i < A.length - 1;i++){
                if (A[i] > A[i-1] && A[i] > A[i+1])
                    return i;
            }
            return A.length - 1;
        }
    }
}
