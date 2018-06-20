package test.zhaobo.solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @program: testForLeetcode
 * @description: subdomainVisits
 * @author: Mr.Zhao
 * @create: 2018-06-14 10:10
 **/
public class SubdomainVisits {
    public List<String> subdomainVisits(String[] cpdomains) {
        Map<String, Integer> map = new HashMap<>();
        for (String domain : cpdomains) {
            if (domain.length() == 0) continue; // 跳过空域名
            int index = domain.indexOf(' ');    // 第一个空格出现的位置
            int time = Integer.valueOf(domain.substring(0, index)); // 空格前的字符为出现次数
            domain = domain.substring(index+1); // 空格后的字符为域名
            map.put(domain, map.getOrDefault(domain, 0)+time);   // 每次根据字符串匹配出现次数，第一次出现初始值为0，否则需要累加

            // 子域名的边界为'.'
            while (domain.indexOf('.') != -1) {
                domain = domain.substring(domain.indexOf('.')+1);
                map.put(domain, map.getOrDefault(domain, 0)+time);
            }
        }
        List<String> res = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String s = entry.getValue() + " " + entry.getKey();  // 出现次数和子域名拼接
            res.add(s);
        }
        return res;
    }
}
