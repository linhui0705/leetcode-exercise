package P0205_IsomorphicStrings;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Title: Solution1
 * Description:
 * 同结构的单词
 * 之前考虑用数组，以为只有大小写，结果发现RE了，没想到测试用例也包含数字了……
 * 后面改用HashMap，只不过效率貌似不高，还有优化的空间
 *
 * @author Lin Hui
 * Created on 2019-1-24 23:20
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertTrue(isIsomorphic("egg", "add"));
        Assert.assertFalse(isIsomorphic("foo", "bar"));
        Assert.assertTrue(isIsomorphic("paper", "title"));
        Assert.assertFalse(isIsomorphic("ab", "aa"));
        Assert.assertFalse(isIsomorphic("aa", "ab"));
    }

    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Character> ssMap = new HashMap<>();
        Map<Character, Character> ttMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ss = s.charAt(i);
            char tt = t.charAt(i);
            if (!ssMap.containsKey(ss)) {
                ssMap.put(ss, tt);
            }
            if (!ttMap.containsKey(tt)) {
                ttMap.put(tt, ss);
            }
            if (!(ssMap.get(ss) == tt && ttMap.get(tt) == ss)) {
                return false;
            }
        }
        return true;
    }
}
