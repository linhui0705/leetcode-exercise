package P0811_SubdomainVisitCount;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Title: Solution1
 * Description:
 * 子域名访问计数
 *
 * @author Lin Hui
 * Created on 2020-1-11 20:33
 */
public class Solution1 {
    @Test
    public void testCase() {
        subdomainVisits(new String[]{"9001 discuss.leetcode.com"});
        subdomainVisits(new String[]{"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"});
    }

    public List<String> subdomainVisits(String[] cpdomains) {
        List<String> ans = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        for (String cpdomain : cpdomains) {
            String[] arr = cpdomain.split(" ");
            int times = Integer.valueOf(arr[0]);
            String domain = arr[1];
            while (true) {
                map.put(domain, map.getOrDefault(domain, 0) + times);
                if (domain.contains(".")) {
                    domain = domain.substring(domain.indexOf(".") + 1);
                } else {
                    break;
                }
            }
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            ans.add(entry.getValue() + " " + entry.getKey());
        }
        return ans;
    }
}
