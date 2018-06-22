package test.zhaobo.solutions;

/**
 * @program: testForLeetcode
 * @description: removeElement
 * @author: Mr.Zhao
 * @create: 2018-06-20 09:22
 **/
public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int realPos = 0;
        for (int i = 0;i < nums.length;i++){
            if (nums[i] != val){
                nums[realPos++] = nums[i];
            }
        }
        return realPos;
    }
}
