package test.zhaobo.solutions;

/**
 * @program: testForLeetcode
 * @description: moveZeroes
 * @author: Mr.Zhao
 * @create: 2018-06-19 17:10
 **/
public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int notZeroPos = 0;
        for (int i = 0;i < nums.length;i++){
            if (nums[i] != 0) nums[notZeroPos++] = nums[i];
        }
        if (notZeroPos == nums.length) return;
        else {
            for (int j = notZeroPos;j < nums.length;j++){
                nums[j] = 0;
            }
            return;
        }
    }
}
