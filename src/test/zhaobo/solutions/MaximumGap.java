package test.zhaobo.solutions;

import java.util.Arrays;

/**
 * @program: testForLeetcode
 * @description: maximumGap
 * @author: Mr.Zhao
 * @create: 2018-06-26 11:46
 **/
public class MaximumGap {
    public int maximumGap(int[] nums) {
        int max = 0;
        if (nums.length < 2) return 0;
        else {
            Arrays.sort(nums);
            for (int i = 0;i < nums.length-1;i++){
                max = Math.abs(nums[i+1] - nums[i]) > max ? Math.abs(nums[i+1] - nums[i]) : max;
            }
        }
        return max;
    }
}
