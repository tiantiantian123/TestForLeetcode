package test.zhaobo.solutions;

import java.util.*;

/**
 * @program: testForLeetcode
 * @description: topKFrequent
 * @author: Mr.Zhao
 * @create: 2018-06-21 14:31
 **/
public class TopKFrequent {
    public List<String> topKFrequent(String[] words, int k) {

        Map<String,Integer> map = new HashMap<>();
        for(String word:words)
            map.put(word,map.getOrDefault(word,0)+1);
        List<String>[] buckets = new List[words.length+1];
        for(String key:map.keySet()){
            int freq = map.get(key);
            if(buckets[freq]==null)
                buckets[freq] = new LinkedList<>();
            buckets[freq].add(key);
        }
        List<String> ans = new LinkedList<>();
        int c = 0;
        for(int i = buckets.length-1;i>=0&&k>0;i--){
            if(buckets[i]!=null){
                Collections.sort(buckets[i]);
                for(int j=0;j<buckets[i].size();j++) {
                    if(c==k)
                        return ans;
                    ans.add(buckets[i].get(j));
                    c++;
                }
            }
        }
        return ans ;
    }
}
