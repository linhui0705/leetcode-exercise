package P0242_ValidAnagram;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: Solution2
 * Description:
 * Discuss看到的一个Good Solution
 *
 * @author Lin Hui
 * Created on 2019-1-21 20:36
 */
public class Solution2 {
    @Test
    public void testCase() {
        Assert.assertTrue(isAnagram("anagram", "nagaram"));
        Assert.assertFalse(isAnagram("rat", "car"));
    }

    public boolean isAnagram(String s, String t) {
        int[] alphabet = new int[26];
        for (char c : s.toCharArray()) {
            alphabet[c - 'a']++;
        }
        for (char c : t.toCharArray()) {
            alphabet[c - 'a']--;
        }
        for (int i : alphabet) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }
}
