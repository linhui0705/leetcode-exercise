package P1528_ShuffleString;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: Solution2
 * Description:
 * 港真，这样真的好简单。之前真想复杂了……
 *
 * @author Lin Hui
 * Created on 2021/2/10 21:52:14
 */
public class Solution2 {
    @Test
    public void testCase() {
        Assert.assertEquals("leetcode", restoreString("codeleet", new int[]{4, 5, 6, 7, 0, 2, 1, 3}));
        Assert.assertEquals("abc", restoreString("abc", new int[]{0, 1, 2}));
        Assert.assertEquals("nihao", restoreString("aiohn", new int[]{3, 1, 4, 2, 0}));
        Assert.assertEquals("arigatou", restoreString("aaiougrt", new int[]{4, 0, 2, 6, 7, 3, 1, 5}));
        Assert.assertEquals("rat", restoreString("art", new int[]{1, 0, 2}));
    }

    public String restoreString(String s, int[] in) {
        char[] c = new char[in.length];
        for (int i = 0; i < in.length; i++) {
            c[in[i]] = s.charAt(i);
        }
        return new String(c);
    }
}
