package test.zhaobo.solutions;

/**
 * @program: testForLeetcode
 * @description: getSum
 * @author: Mr.Zhao
 * @create: 2018-06-14 14:31
 **/
public class GetSum {
    public int getSum(int a, int b) {
        //异或是没有进位直接相加，而位与则是需要进的位，二者相加才是和
        if((a&b) == 0)
            return a|b;
        return getSum(a^b,(a&b)<<1);
    }
}
