package test.zhaobo.solutions;

/**
 * @program: testForLeetcode
 * @description: findMaxConsecutiveOnes
 * @author: Mr.Zhao
 * @create: 2018-06-19 16:32
 **/
public class FindMaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int count = 0;
        for (int i = 0;i < nums.length;i++){
            if (nums[i] == 1) {
                count++;
                max = max > count ? max : count;
            }
            else count = 0;
        }
        return max;
    }
}
