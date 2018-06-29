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
        SingleNumber3 singleNumber3 = new SingleNumber3();
        int[] arr = {1,2,1,3,2,5};
        int[] res = singleNumber3.singleNumber(arr);
        for (int n : res){
            System.out.println(n);
        }
    }
}
