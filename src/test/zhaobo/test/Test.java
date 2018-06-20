package test.zhaobo.test;

import test.zhaobo.solutions.*;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @program: testForLeetcode
 * @description: test
 * @author: Mr.Zhao
 * @create: 2018-06-05 17:29
 **/
public class Test {
    public static void main(String[] args) {
        int[] arr = {1,1,1,0,0,1,1};
        FindMaxConsecutiveOnes findMaxConsecutiveOnes = new FindMaxConsecutiveOnes();
        System.out.println(findMaxConsecutiveOnes.findMaxConsecutiveOnes(arr));
    }
}
