package test.zhaobo.solutions;

import java.util.LinkedList;
import java.util.List;

/**
 * @program: testForLeetcode
 * @description: selfDividingNumbers
 * @author: Mr.Zhao
 * @create: 2018-06-13 17:29
 **/
public class SelfDividingNumbers {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new LinkedList<>();
        for (int i = left;i<=right;i++){
            int num = i;
            while (num != 0){

                if (num%10 != 0 && i % (num%10) == 0){
                    num /= 10;
                }
                else break;
            }
            if (num == 0) list.add(i);
        }
        return list;
    }
}
