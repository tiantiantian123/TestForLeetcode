package test.zhaobo.solutions;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @program: testForLeetcode
 * @description: combine
 * @author: Mr.Zhao
 * @create: 2018-06-20 11:21
 **/
public class Combine {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> llist = new ArrayList<List<Integer>>();
        List<Integer> list = new ArrayList<Integer>();
        comeback(1,n,k,list,llist);
        return llist;
    }
    static void comeback(int temp, int n, int k,List<Integer> list,List<List<Integer>> llist){
        if (list.size() == k) {
            llist.add(new ArrayList<Integer>(list));//这里必须是new一个。如果直接是list的话会发现最后是空的，因为list最后都被清空了。
            return;
        }
        for (int i = temp; i <= n; i++) {
            list.add(i);
            comeback(i+1,n,k,list,llist);
            list.remove(list.size()-1);
        }
    }
}
