package test.zhaobo.solutions;

import java.util.Arrays;

/**
 * @program: testForLeetcode
 * @description: arrayPairSum
 * @author: Mr.Zhao
 * @create: 2018-06-14 10:00
 **/
public class ArrayPairSum {
    public int arrayPairSum(int[] nums) {
        int res = 0;
        Arrays.sort(nums);
        for (int i = 0;i<nums.length;i+=2){
            res += nums[i];
        }
        return res;
    }
}
