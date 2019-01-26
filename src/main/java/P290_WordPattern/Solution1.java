package P290_WordPattern;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Title: Solution1
 * Description:
 * 用HashMap解题
 *
 * @author Lin Hui
 * Created on 2019-1-26 14:34
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertTrue(wordPattern("abba", "dog cat cat dog"));
        Assert.assertFalse(wordPattern("abba", "dog cat cat fish"));
        Assert.assertFalse(wordPattern("aaaa", "dog cat cat dog"));
        Assert.assertFalse(wordPattern("abba", "dog dog dog dog"));
    }

    public boolean wordPattern(String pattern, String str) {
        String[] words = str.split(" ");
        if (pattern.length() != words.length) {
            return false;
        }
        Map<Character, String> map = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            if (!map.containsKey(c) && !map.containsValue(words[i])) {
                map.put(c, words[i]);
            } else if (!words[i].equals(map.get(c))) {
                return false;
            }
        }
        return true;
    }
}
