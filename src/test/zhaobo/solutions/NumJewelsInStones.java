package test.zhaobo.solutions;

/**
 * @program: testForLeetcode
 * @description: numJewelsInStones
 * @author: Mr.Zhao
 * @create: 2018-06-07 15:08
 **/
public class NumJewelsInStones {
    public int numJewelsInStones(String J, String S) {
        int count = 0;
        for (int i = 0;i < S.length();i++){
            if (J.indexOf(String.valueOf(S.charAt(i))) != -1){
                count++;
            }
        }
        return count;
    }
}
