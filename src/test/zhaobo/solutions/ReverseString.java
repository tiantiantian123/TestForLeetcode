package test.zhaobo.solutions;

/**
 * @program: testForLeetcode
 * @description: reverseString
 * @author: Mr.Zhao
 * @create: 2018-06-13 16:48
 **/
public class ReverseString {
    public String reverseString(String s) {
        StringBuilder builder = new StringBuilder(s);
        return builder.reverse().toString();
    }
}
