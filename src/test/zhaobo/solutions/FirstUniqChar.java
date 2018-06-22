package test.zhaobo.solutions;

import java.util.Arrays;

/**
 * @program: testForLeetcode
 * @description: firstUniqChar
 * @author: Mr.Zhao
 * @create: 2018-06-22 09:58
 **/
public class FirstUniqChar {
    public int firstUniqChar(String s) {
        for (int i = 0;i < s.length();i++){
            if (!s.substring(0,i).contains(s.substring(i,i+1)) && !s.substring(i+1,s.length()).contains(s.substring(i,i+1)))
                return i;
        }
        return -1;
    }
}
