package test.zhaobo.solutions;

/**
 * @program: testForLeetcode
 * @description: reverseWords
 * @author: Mr.Zhao
 * @create: 2018-06-14 09:34
 **/
public class ReverseWords {
    public String reverseWords(String s) {
        StringBuilder res = new StringBuilder("");
        String[] str = s.split(" ");
        for (int i = 0;i<str.length;i++){
            StringBuilder builder = new StringBuilder(str[i]);
            builder = builder.reverse();
            res.append(builder);
            if (i < str.length-1) res.append(" ");
        }
        return res.toString();
    }
}
