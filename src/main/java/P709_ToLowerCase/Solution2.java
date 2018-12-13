package P709_ToLowerCase;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: Solution2
 * Description:
 *
 * @author Lin Hui
 * Created on 2018-12-13 22:35
 */
public class Solution2 {
    @Test
    public void testCase() {
        Assert.assertEquals("hello", toLowerCase("Hello"));
        Assert.assertEquals("here", toLowerCase("here"));
        Assert.assertEquals("lovely", toLowerCase("LOVELY"));
    }

    public String toLowerCase(String str) {
        char[] chars = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (chars[i] >= 'A' && chars[i] <= 'Z') {
                sb.append((char) (chars[i] + 'a' - 'A'));
            } else {
                sb.append(chars[i]);
            }
        }
        System.out.println(sb.toString());
        return sb.toString();
    }
}
