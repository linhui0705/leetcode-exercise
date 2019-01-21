package P387_FirstUniqueCharacterInAString;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 找出单词中没有重复的字母，输出索引序号，若无则返回-1
 *
 * @author Lin Hui
 * Created on 2019-1-21 20:48
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertEquals(0, firstUniqChar("leetcode"));
        Assert.assertEquals(2, firstUniqChar("loveleetcode"));
        Assert.assertEquals(-1, firstUniqChar("aadadaad"));
    }

    public int firstUniqChar(String s) {
        int[] arrays = new int[26];
        for (int i = 0; i < s.length(); i++) {
            int index = arrays[s.charAt(i) - 'a'];
            if (index > 0) {
                arrays[s.charAt(i) - 'a'] = -1;
            } else if (index == 0) {
                arrays[s.charAt(i) - 'a'] = i + 1;
            }
        }
        for (int i = 0; i < s.length(); i++) {
            int index = arrays[s.charAt(i) - 'a'];
            if (index > 0) {
                return index - 1;
            }
        }
        return -1;
    }
}
