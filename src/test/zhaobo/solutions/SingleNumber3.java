package test.zhaobo.solutions;

import java.util.Arrays;

/**
 * @program: testForLeetcode
 * @description: singleNumber3
 * @author: Mr.Zhao
 * @create: 2018-06-27 09:23
 **/
public class SingleNumber3 {
    public int[] singleNumber(int[] nums) {
        int i = 0, pos = 0;
        int[] res = new int[2];
        Arrays.sort(nums);
        if (nums.length <= 2)
            res = nums;
        else {
            while (i <= nums.length-2){
                if (nums[i] == nums[i+1]){
                    i += 2;
                }
                else {
                    res[pos++] = nums[i++];
                }
            }
            if (i == nums.length-1)
                res[pos] = nums[nums.length-1];
        }
        return res;
    }
}
