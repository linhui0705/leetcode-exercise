package P242_ValidAnagram;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Title: Solution1
 * Description:
 * 两字符串颠倒其中某个字符的顺序，最终两字符串依旧相等
 *
 *
 * @author Lin Hui
 * Created on 2019-1-21 20:22
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertTrue(isAnagram("anagram", "nagaram"));
        Assert.assertFalse(isAnagram("rat", "car"));
    }

    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        for (char c : t.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) - 1);
            } else {
                map.put(c, -1);
            }
        }
        for (Map.Entry<Character, Integer> set : map.entrySet()) {
            if (set.getValue() != 0) {
                return false;
            }
        }
        return !s.equals(t);
    }
}
