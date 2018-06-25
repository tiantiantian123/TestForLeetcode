package test.zhaobo.solutions;

/**
 * @program: testForLeetcode
 * @description: pivotIndex
 * @author: Mr.Zhao
 * @create: 2018-06-22 13:56
 **/
public class PivotIndex {
    public int pivotIndex(int[] nums) {
        if (nums.length < 1) return -1;
        else {
            int left = 0, right = nums.length - 1;
            int lSum = nums[left], rSum = nums[right];
            while (right > left && nums.length >= 3) {
                if (lSum > rSum) {
                    if (nums[right-1] > 0){
                        rSum += nums[--right];
                    }
                    else lSum += nums[++left];

                }
                else if (lSum < rSum) {
                    if (nums[left+1] > 0){
                        lSum += nums[++left];
                    }
                    else rSum += nums[--right];

                }
                else {
                    if (right - left == 2) {
                        return left + 1;
                    }
                    else {
                        rSum += nums[--right];
                        lSum += nums[++left];
                    }
                }
            }
        }

        return -1;
    }
}
