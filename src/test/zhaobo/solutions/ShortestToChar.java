package test.zhaobo.solutions;

/**
 * @program: testForLeetcode
 * @description: shortestToChar
 * @author: Mr.Zhao
 * @create: 2018-06-14 14:07
 **/
public class ShortestToChar {
    public int[] shortestToChar(String S, char C) {
        int[] res = new int[S.length()];
        for (int i = 0;i < S.length();i++){
            for (int k = 0;k < S.length();k++){
                if (i+k<S.length() || i-k>=0){
                    if ((i-k>=0 && S.charAt(i-k) == C) || (i+k<S.length() && S.charAt(i+k) == C)){
                        res[i] = k;
                        break;
                    }
                }
                else break;

            }
        }
        return res;
    }
}
