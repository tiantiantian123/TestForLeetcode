package test.zhaobo.solutions;

/**
 * @program: testForLeetcode
 * @description: detectCapitalUse
 * @author: Mr.Zhao
 * @create: 2018-06-20 14:27
 **/
public class DetectCapitalUse {
    public boolean detectCapitalUse(String word) {
        int i;
        if (word.length() == 1) return true;
        if (word.charAt(0) >= 'a' && word.charAt(0) <= 'z'){
            for (i = 1;i < word.length();i++){
                if (word.charAt(i) < 'a' || word.charAt(i) > 'z')
                    break;
            }
            return i == word.length();
        }
        if (word.charAt(0) >= 'A' && word.charAt(0) <= 'Z'){
            for (i = 1;i < word.length();i++){
                if (word.charAt(1) >= 'A' && word.charAt(1) <= 'Z'){
                    if (word.charAt(i) >= 'a' && word.charAt(i) <= 'z')
                        break;
                }

                if (word.charAt(1) >= 'a' && word.charAt(1) <= 'z'){
                    if (word.charAt(i) >= 'A' && word.charAt(i) <= 'Z')
                        break;
                }
            }
            return i == word.length();

        }
        return true;
    }
}
