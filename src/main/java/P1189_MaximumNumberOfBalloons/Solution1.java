package P1189_MaximumNumberOfBalloons;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 给定一串字符，算出这串字符能组成多少个"balloon"单词
 *
 * @author Lin Hui
 * Created on 2019-12-26 20:13
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertEquals(1, maxNumberOfBalloons("nlaebolko"));
        Assert.assertEquals(2, maxNumberOfBalloons("loonbalxballpoon"));
        Assert.assertEquals(0, maxNumberOfBalloons("leetcode"));
    }

    public int maxNumberOfBalloons(String text) {
        int[] ch = new int[26];
        int ans = 0;
        for (char c : text.toCharArray()) {
            ch[c - 'a']++;
        }
        while (ch['b' - 'a'] > 0 && ch['a' - 'a'] > 0 && ch['l' - 'a'] > 1 && ch['o' - 'a'] > 1 && ch['n' - 'a'] > 0) {
            ch['b' - 'a']--;
            ch['a' - 'a']--;
            ch['l' - 'a'] -= 2;
            ch['o' - 'a'] -= 2;
            ch['n' - 'a']--;
            ans++;
        }
        return ans;
    }
}
