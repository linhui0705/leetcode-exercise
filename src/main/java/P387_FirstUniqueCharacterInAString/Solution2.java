package P387_FirstUniqueCharacterInAString;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: Solution2
 * Description:
 * 做了优化
 *
 * @author Lin Hui
 * Created on 2019-1-21 21:03
 */
public class Solution2 {
    @Test
    public void testCase() {
        Assert.assertEquals(0, firstUniqChar("leetcode"));
        Assert.assertEquals(2, firstUniqChar("loveleetcode"));
        Assert.assertEquals(-1, firstUniqChar("aadadaad"));
    }

    public int firstUniqChar(String s) {
        int[] arrays = new int[26];
        for (int i = 0; i < s.length(); i++) {
            arrays[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (arrays[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }
}
