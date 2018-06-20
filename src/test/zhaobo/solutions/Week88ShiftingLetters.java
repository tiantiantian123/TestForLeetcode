package test.zhaobo.solutions;

/**
 * @program: testForLeetcode
 * @description: week88shiftingLetters
 * @author: Mr.Zhao
 * @create: 2018-06-11 09:55
 **/
public class Week88ShiftingLetters {
    public String shiftingLetters(String S, int[] shifts) {
        int pos = 1;

        for (int m = 0;m<pos;m++){
            for (int n = 0;n<pos;n++){
                if (pos>shifts.length) {
                    return S;
                }
                char mid = (char) ((S.charAt(m)+shifts[n])%'a'+'a');
                System.out.println(String.valueOf(mid));
                S = S.substring(0,m) + mid + S.substring(m+1,S.length());
                System.out.println(S);


            }
            pos++;

        }
        return S;
    }
}
