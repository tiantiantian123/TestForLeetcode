package test.zhaobo.solutions;

import java.util.Arrays;

/**
 * @program: testForLeetcode
 * @description: findKthLargest
 * @author: Mr.Zhao
 * @create: 2018-06-25 15:24
 **/
public class FindKthLargest {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
}
