package test.zhaobo.solutions;

import java.util.Arrays;

/**
 * @program: testForLeetcode
 * @description: thirdMax
 * @author: Mr.Zhao
 * @create: 2018-06-21 15:54
 **/
public class ThirdMax {
    public int thirdMax(int[] nums) {
        if (nums == null || nums.length == 0)
            return -1;
        int len = nums.length;
        if (len == 1)
            return nums[0];
        if (len == 2)
            return Math.max(nums[0], nums[1]);
        int cf=len,n1,n2,n3;
        n1=n2=n3=Integer.MIN_VALUE;
        boolean fi=false;
        for(int num:nums) {
            if(num==Integer.MIN_VALUE&&!fi){//用于解决第一次出现最小值的问题
                fi=true;
                continue;
            }
            if(num==n1||num==n2||n3==num) {
                cf--;
                continue;
            }
            if(num>n1) {
                n3=n2;n2=n1;
                n1=num;continue;
            }
            else if(num>n2) {
                n3=n2;
                n2=num;continue;
            }
            else if(num>n3) {
                n3=num;
            }

        }
        return cf>=3?n3:n1;
    }
}
