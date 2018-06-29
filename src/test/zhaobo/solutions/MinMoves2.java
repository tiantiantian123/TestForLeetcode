package test.zhaobo.solutions;

import java.util.Arrays;

/**
 * @program: testForLeetcode
 * @description: minMoves2
 * @author: Mr.Zhao
 * @create: 2018-06-25 17:02
 **/
public class MinMoves2 {
    public int minMoves2(int[] nums) {
        int n = nums.length;
        if( n <= 1 ){
            return 0;
        }
        else {
            Arrays.sort(nums);    //对数组排序
            int mean = nums[n/2];       //找出中位数，中位数即为数组中下标在中间的数
            int i;
            int res = 0;         //记录移动步数
            for( i = 0; i < n; i++){
                res += Math.abs(nums[i]-mean);       //数组个数字减去中位数，即得移动步数
            }
            return res;
        }
    }
}
