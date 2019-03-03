package P1003_CheckIfWordIsValidAfterSubstitutions;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * X + "abc" + Y 是有效的，X和Y可能是空串。
 * 其实题目的本质就是，每次去掉字符串中的子串"abc"，最后剩下的是否为空字符串。
 * 用了replace()方法偷个懒吧……
 *
 * @author Lin Hui
 * Created on 2019-3-3 11:39
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertTrue(isValid("aabcbc"));
        Assert.assertTrue(isValid("abcabcababcc"));
        Assert.assertFalse(isValid("abccba"));
        Assert.assertFalse(isValid("cababc"));

        Assert.assertTrue(isValid("abc"));
        Assert.assertTrue(isValid("aabcbc"));
        Assert.assertTrue(isValid("abcabc"));
        Assert.assertTrue(isValid("abcabcababcc"));

        Assert.assertFalse(isValid("abccba"));
        Assert.assertFalse(isValid("ab"));
        Assert.assertFalse(isValid("cababc"));
        Assert.assertFalse(isValid("bac"));

        Assert.assertTrue(isValid("aabcabcbc"));
    }

    public boolean isValid(String S) {
        int oldLen;
        do {
            oldLen = S.length();
            S = S.replace("abc", "");
        } while (oldLen != S.length());
        return S.length() == 0;
    }
}
