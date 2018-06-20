package test.zhaobo.solutions;

import java.util.HashSet;
import java.util.Set;

/**
 * @program: testForLeetcode
 * @description: distributeCandies
 * @author: Mr.Zhao
 * @create: 2018-06-15 09:20
 **/
public class DistributeCandies {
    public int distributeCandies(int[] candies) {

        Set set = new HashSet();
        for (int i = 0;i < candies.length;i++){
            set.add(candies[i]);
        }
        return candies.length/2 > set.size() ? set.size() : candies.length/2;
    }
}
