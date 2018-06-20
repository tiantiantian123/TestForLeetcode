package test.zhaobo.solutions;

/**
 * @program: testForLeetcode
 * @description: findComplement
 * @author: Mr.Zhao
 * @create: 2018-06-13 14:01
 **/
public class FindComplement {
    public int findComplement(int num) {
        String res = Integer.toBinaryString(num);
        for (int i = 0;i<res.length();i++){
            if (res.charAt(i) == '0'){
                res = res.substring(0,i) + "1" +res.substring(i+1,res.length());
            }
            else {
                res = res.substring(0,i) + "0" +res.substring(i+1,res.length());
            }
        }
        int result = Integer.valueOf(res,2);
        return result;

    }
}
