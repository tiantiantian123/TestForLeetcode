package test.zhaobo.solutions;

import java.util.Arrays;

/**
 * @program: testForLeetcode
 * @description: The sum of two Numbers
 * @author: Mr.Zhao
 * @create: 2018-06-06 15:41
 **/
public class SumOfTwo {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        for (int i=0;i<nums.length;i++){
            for (int k=0;k<nums.length;k++){
                if (k != i && nums[i] + nums[k] == target){
                    res[0] = k;
                    res[1] = i;
                }
            }
        }
        return res;
    }
}