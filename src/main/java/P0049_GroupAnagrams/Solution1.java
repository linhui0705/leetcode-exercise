package P0049_GroupAnagrams;

import org.junit.Test;

import java.util.*;

/**
 * Title: Solution1
 * Description:
 * 给定一个字符串数组，将字母异位词组合在一起。字母异位词指字母相同，但排列不同的字符串。
 * 1.均为小写字母
 * 2.无顺序要求
 *
 * @author Lin Hui
 * Created on 2020/4/6 19:52:09
 */
public class Solution1 {
    @Test
    public void testCase() {

    }

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] cs = str.toCharArray();
            Arrays.sort(cs);
            String s = String.valueOf(cs);
            if (!map.containsKey(s)) {
                List<String> list = new ArrayList<>();
                list.add(str);
                map.put(s, list);
            } else {
                map.get(s).add(str);
            }
        }
        for (Map.Entry<String, List<String>> obj : map.entrySet()) {
            ans.add(obj.getValue());
        }
        return ans;
    }
}
