package test.zhaobo.solutions;

/**
 * @program: testForLeetcode
 * @description: judgeCircle
 * @author: Mr.Zhao
 * @create: 2018-06-13 10:10
 **/
public class JudgeCircle {
    public boolean  judgeCircle(String moves) {
        int countL=0,countR=0,countU=0,countD=0;
        for (int i = 0;i<moves.length();i++){
            if (moves.charAt(i) == 'L') countL++;
            if (moves.charAt(i) == 'R') countR++;
            if (moves.charAt(i) == 'U') countU++;
            if (moves.charAt(i) == 'D') countD++;
        }
        if (countL == countR && countU == countD) return true;
        else return false;
    }
}
