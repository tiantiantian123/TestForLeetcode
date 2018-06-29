package test.zhaobo.solutions;

import java.util.Arrays;

/**
 * @program: testForLeetcode
 * @description: singleNonDuplicate
 * @author: Mr.Zhao
 * @create: 2018-06-27 09:13
 **/
public class SingleNonDuplicate {
    public int singleNonDuplicate(int[] nums) {
        int res = 0;
        for (int n : nums){
            res ^= n;
        }
        return res;
    }
}
