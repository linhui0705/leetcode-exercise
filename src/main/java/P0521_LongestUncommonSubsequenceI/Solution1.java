package P0521_LongestUncommonSubsequenceI;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 题目的本质是：字符串相同，返回-1；字符串不相同，返回字符串的最大长度。
 *
 * @author Lin Hui
 * Created on 2019-12-28 12:28
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertEquals(3, findLUSlength("aba", "cdc"));
    }

    public int findLUSlength(String a, String b) {
        if (a.equals(b)) {
            return -1;
        }
        return Math.max(a.length(), b.length());
    }
}
