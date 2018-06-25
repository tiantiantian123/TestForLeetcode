package test.zhaobo.solutions;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: testForLeetcode
 * @description: removeInvalidParentheses
 * @author: Mr.Zhao
 * @create: 2018-06-22 17:37
 **/
public class RemoveInvalidParentheses {
    private void removeLeft(String s, int matchTo, int removeTo, List<String> results) {
        int matched = 0;
        for(int m=matchTo; m>=0; m--) {
            if (s.charAt(m) == ')') matched ++;
            else if (s.charAt(m) == '(') matched --;
            if (matched >= 0) continue;
            for(int r=removeTo; r>=m; r--) {
                //检查是左括号才能删除
                if (s.charAt(r) != '(') continue;
                if (r==removeTo || s.charAt(r+1) != '(') removeLeft(s.substring(0, r)+s.substring(r+1), m-1, r-1, results);
            }
            //如果本次有删除，则留待后面加入到results
            return;
        }
        results.add(s);
    }
    private void removeRight(String s, int matchTo, int removeTo, List<String> results) {
        int matched = 0;
        for(int m=matchTo; m<s.length(); m++) {
            if (s.charAt(m) == '(') matched ++;
            else if (s.charAt(m) == ')') matched --;
            if (matched >= 0) continue;
            for(int r=removeTo; r<=m; r++) {
                //检查是右括号才能删除
                if (s.charAt(r) != ')') continue;
                if (r==removeTo || s.charAt(r-1) != ')') removeRight(s.substring(0, r)+s.substring(r+1), m, r, results);
            }
            //如果本次有删除，则留待后面加入到results
            return;
        }
        removeLeft(s, s.length()-1, s.length()-1, results);
    }
    public List<String> removeInvalidParentheses(String s) {
        List<String> results = new ArrayList<>();
        removeRight(s, 0, 0, results);
        return results;
    }
}
