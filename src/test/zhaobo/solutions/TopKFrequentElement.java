package test.zhaobo.solutions;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @program: testForLeetcode
 * @description: topKFrequentElement
 * @author: Mr.Zhao
 * @create: 2018-06-28 11:24
 **/
public class TopKFrequentElement {
    public List<Integer> topKFrequent(int[] nums, int k) {
        List<Integer> res = new ArrayList<>();
        Map<Integer,Integer> map = new TreeMap<>();
        for(int i = 0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i]).intValue()+1);
            }else{
                map.put(nums[i],1);
            }
        }
        List<Map.Entry<Integer,Integer>> list = new ArrayList<Map.Entry<Integer,Integer>>(map.entrySet());
        //然后通过比较器来实现排序
        Collections.sort(list,new Comparator<Map.Entry<Integer,Integer>>() {
            //降序
            public int compare(Map.Entry<Integer, Integer> o1,
                               Map.Entry<Integer, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }

        });
        for(Map.Entry<Integer,Integer> mapping:list){
            res.add(mapping.getKey());
            if(res.size()==k){
                break;
            }
        }
        return res;
    }
}
