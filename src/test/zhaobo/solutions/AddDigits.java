package test.zhaobo.solutions;

/**
 * @program: testForLeetcode
 * @description: addDigits
 * @author: Mr.Zhao
 * @create: 2018-06-19 16:43
 **/
public class AddDigits {
    public int addDigits(int num) {
        if (num <10) return num;
        return num % 9 == 0 ? 9 : num % 9;
    }
}
