package test.zhaobo.solutions;

/**
 * @program: testForLeetcode
 * @description: hasAlternatingBits
 * @author: Mr.Zhao
 * @create: 2018-06-14 11:27
 **/
public class HasAlternatingBits {
    public boolean hasAlternatingBits(int n) {
        int num = n,temp = -1;
        boolean flag = true;
        while (num!=0){
            if (temp == num%2){
                flag = false;
                break;
            }else {
                temp = num % 2;
                num /= 2;
            }
        }
        return flag;
    }
}
