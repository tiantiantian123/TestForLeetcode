package test.zhaobo.solutions;

/**
 * @program: testForLeetcode
 * @description: nextGreaterElement
 * @author: Mr.Zhao
 * @create: 2018-06-14 17:18
 **/
public class NextGreaterElement {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n;
        int[] arr = new int[nums1.length];
        for (int m = 0;m<nums1.length;m++){
            int flag = 0;
            for (n = 0;n<nums2.length;n++){
                if (nums1[m] == nums2[n]) flag = 1;
                if (nums2[n] > nums1[m] && flag == 1) {
                    arr[m] = nums2[n];
                    break;
                }

            }
            if (n == nums2.length) arr[m] = -1;

        }
        return arr;
    }
}
