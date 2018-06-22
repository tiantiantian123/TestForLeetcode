package test.zhaobo.solutions;

/**
 * @program: testForLeetcode
 * @description: isPowerOfTwo
 * @author: Mr.Zhao
 * @create: 2018-06-21 10:26
 **/
public class IsPowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) return false;
        return (n & (n-1)) == 0;
    }
}
