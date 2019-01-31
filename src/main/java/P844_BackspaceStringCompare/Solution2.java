package P844_BackspaceStringCompare;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: Solution2
 * Description:
 * 方法二：Two Pointers
 * 4ms，超过100%
 *
 * @author Lin Hui
 * Created on 2019-1-31 23:13
 */
public class Solution2 {
    @Test
    public void testCase() {
        Assert.assertTrue(backspaceCompare("ab#c", "ad#c"));
        Assert.assertTrue(backspaceCompare("ab##", "c#d#"));
        Assert.assertTrue(backspaceCompare("a##c", "#a#c"));
        Assert.assertFalse(backspaceCompare("a#c", "b"));
        Assert.assertTrue(backspaceCompare("#####", "#"));
        Assert.assertTrue(backspaceCompare("", ""));
    }

    public boolean backspaceCompare(String S, String T) {
        return getString(S).equals(getString(T));
    }

    public String getString(String str) {
        StringBuilder result = new StringBuilder();
        int k = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            char c = str.charAt(i);
            if (c == '#') {
                k++;
            } else {
                if (k > 0) {
                    k--;
                } else {
                    result.append(c);
                }
            }
        }
        return result.toString();
    }
}
