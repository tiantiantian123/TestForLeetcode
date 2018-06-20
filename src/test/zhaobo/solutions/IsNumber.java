package test.zhaobo.solutions;

/**
 * @program: testForLeetcode
 * @description: isNumber
 * @author: Mr.Zhao
 * @create: 2018-06-06 16:44
 **/
public class IsNumber {
    public boolean isNumber(String s) {
        int eCount = 0, i =0;
        s = s.trim();
        if (s.equals("")) {
           return false;
        }
        for (i = 0;i <s.length();i++){
            if ((s.charAt(i) == '-' || s.charAt(i) == '+')&& i == 0){
                continue;
            }
            else if (s.charAt(i) >= '0' && s.charAt(i) <= '9'){
                continue;
            }
            else if (s.charAt(i) == 'e' && eCount == 0 && i < s.length()-1 && i >0){
                eCount++;
            }
            else if (s.charAt(i) == '.' && eCount == 0 && s.length() != 1 && (((i-1 >= 0)&&(s.charAt(i-1) >= '0' && s.charAt(i-1) <= '9')) || ((i+1 < s.length())&&(s.charAt(i+1) >= '0' && s.charAt(i+1) <= '9')))){
                eCount++;
            }
            else break;
        }
        return i == s.length();
    }
}
