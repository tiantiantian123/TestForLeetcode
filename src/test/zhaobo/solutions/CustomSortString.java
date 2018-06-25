package test.zhaobo.solutions;

/**
 * @program: testForLeetcode
 * @description: customSortString
 * @author: Mr.Zhao
 * @create: 2018-06-25 14:27
 **/
public class CustomSortString {
    public String customSortString(String S, String T) {
        StringBuilder t = new StringBuilder(T);
        StringBuilder sb = new StringBuilder();
        for (int i = 0;i < S.length();i++){
            while (t.indexOf(String.valueOf(S.charAt(i))) != -1){
                t.deleteCharAt(t.indexOf(String.valueOf(S.charAt(i))));
                sb.append(S.charAt(i));
            }
        }
        if (sb.length() < T.length()){
            for (int i = 0;i < T.length();i++){
                if (!S.contains(String.valueOf(T.charAt(i))))
                    sb.append(T.charAt(i));
            }
        }
        return sb.toString();
    }
}
