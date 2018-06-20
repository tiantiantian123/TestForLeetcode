package test.zhaobo.solutions;

/**
 * @program: testForLeetcode
 * @description: singleNumber
 * @author: Mr.Zhao
 * @create: 2018-06-15 09:53
 **/
public class SingleNumber {
    //search from the internet,don‘t know why
    public int singleNumber(int[] A) {
        int ones = 0, twos = 0;
        for(int i = 0; i < A.length; i++){
            ones = (ones ^ A[i]) & ~twos;
            twos = (twos ^ A[i]) & ~ones;
        }
        return ones;
    }
}
