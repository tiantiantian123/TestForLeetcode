package test.zhaobo.solutions;

/**
 * @program: testForLeetcode
 * @description: findLUSlength
 * @author: Mr.Zhao
 * @create: 2018-06-19 14:16
 **/
public class FindLUSlength {
    public int findLUSlength(String a, String b) {
        int value = 0;
        int lengthA = a.length();
        int lengthB = b.length();

        if(lengthA!=lengthB)
        {
            value =Math.max(lengthA, lengthB);
        }
        else
        {
            if(a.equals(b))
            {
                value =-1;
            }
            else
            {
                value =lengthA;
            }
        }

        return value;

    }
}
