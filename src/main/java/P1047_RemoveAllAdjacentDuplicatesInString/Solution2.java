package P1047_RemoveAllAdjacentDuplicatesInString;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: Solution2
 * Description:
 * 使用StringBuilder，会快不少
 *
 * @author Lin Hui
 * Created on 2019/5/27 13:54
 */
public class Solution2 {
    @Test
    public void testCase() {
        Assert.assertEquals("", removeDuplicates(""));
        Assert.assertEquals("ca", removeDuplicates("abbaca"));
        Assert.assertEquals("", removeDuplicates("aabbccdd"));
        Assert.assertEquals("cd", removeDuplicates("aabbcddd"));
    }

    public String removeDuplicates(String S) {
        StringBuilder sb = new StringBuilder();
        for (char c : S.toCharArray()) {
            if (sb.length() > 0) {
                int top = sb.length() - 1;
                if (sb.charAt(top) == c) {
                    sb.deleteCharAt(top);
                    continue;
                }
            }
            sb.append(c);
        }
        return sb.toString();
    }
}
