package test.zhaobo.solutions;

/**
 * @program: testForLeetcode
 * @description: integerBreak
 * @author: Mr.Zhao
 * @create: 2018-06-25 15:59
 **/
public class IntegerBreak {
    public int integerBreak(int n) {
        //拆分出来不是2就是3
        if (n<2) return 0;
        if (n==2) return 1;
        if (n==3) return 2;
        int p = 1;
        while (n>4) {
            p *= 3;
            n -= 3;
        }
        p *= n;
        return p;
    }
}
