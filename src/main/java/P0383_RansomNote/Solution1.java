package P0383_RansomNote;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 题目大意是，ransomNote当中的字母，能否在magazine当中找到。
 * 有些费解，可能理解有偏差吧……
 *
 * @author Lin Hui
 * Created on 2019/2/28 15:29
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertFalse(canConstruct("a", "b"));
        Assert.assertFalse(canConstruct("aa", "ab"));
        Assert.assertFalse(canConstruct("aa", "aab"));
    }

    public boolean canConstruct(String ransomNote, String magazine) {
        int[] count = new int[26];
        for (char c : ransomNote.toCharArray()) {
            count[c - 'a']++;
        }
        for (char c : magazine.toCharArray()) {
            if (count[c - 'a'] > 0) {
                count[c - 'a']--;
            }
        }
        for (int i : count) {
            if (i > 0) {
                return false;
            }
        }
        return true;
    }
}
