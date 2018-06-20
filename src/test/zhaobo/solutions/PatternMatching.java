package test.zhaobo.solutions;

/**
 * @program: testForLeetcode
 * @description: a test for leetcode
 * @author: Mr.Zhao
 * @create: 2018-06-05 17:28
 **/
//still have some problems, don't know if it is wrong with the question of Greed match or Non-greedy matching
public class PatternMatching {
    public boolean isMatch(String s, String p) {
        int flags = 0,flagp = 0;
        while (flags<s.length() && flagp<p.length()){
            if (s.charAt(flags) >= 'a' && s.charAt(flags) <= 'z'){
                if (s.charAt(flags) == p.charAt(flagp) || p.charAt(flagp) == '.'){
                    flagp++;
                    flags++;
                }
                else if (flagp>=1 && (p.charAt(flagp-1) == s.charAt(flags) || p.charAt(flagp-1) == '.') && p.charAt(flagp) =='*'){

                    if(flags == s.length()){
                        break;
                    }
                    else {
                        flags++;
                        flagp++;
                    }
                }
                else if (flagp < p.length()-1 && ((p.charAt(flagp) != s.charAt(flags) && p.charAt(flagp + 1) =='*') || (p.charAt(flagp) == '*' && p.charAt(flagp-1) != s.charAt(flags)))){

                    flagp++;
                }
                else break;
            }
        }
        return  flags == s.length() && flagp == p.length();
    }
}
