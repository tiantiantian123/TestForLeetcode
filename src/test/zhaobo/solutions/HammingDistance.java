package test.zhaobo.solutions;

/**
 * @program: testForLeetcode
 * @description: hammingDistance
 * @author: Mr.Zhao
 * @create: 2018-06-13 13:38
 **/
public class HammingDistance {
    public int hammingDistance(int x, int y) {
        int count = 0;
        int res = x ^ y;
        String result = Integer.toBinaryString(res);
        for (int i = 0;i<result.length();i++){
            if (result.charAt(i) == '1') count++;
        }
        return count;
    }
}
