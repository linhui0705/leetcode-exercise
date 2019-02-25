package P0541_ReverseStringII;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 字符反转。每隔2k个字符，反转前k个字符，若不足k个字符，则将余下不足的字符进行反转。
 *
 * @author Lin Hui
 * Created on 2019/2/14 9:25
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertEquals("bacdfeg", reverseStr("abcdefg", 2));
        Assert.assertEquals("cbadefihgjkl", reverseStr("abcdefghijkl", 3));
        Assert.assertEquals("abc", reverseStr("abc", 1));
        Assert.assertEquals("", reverseStr("", 1000));
        Assert.assertEquals("cba", reverseStr("abc", 3));
        Assert.assertEquals("cbadefg", reverseStr("abcdefg", 3));
        Assert.assertEquals("gfedcba", reverseStr("abcdefg", 8));
    }

    public String reverseStr(String s, int k) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < s.length(); i = i + 2 * k) {
            int m = i;
            int n = Math.min(i + k - 1, s.length() - 1);
            while (m < n) {
                char tmp = chars[m];
                chars[m] = chars[n];
                chars[n] = tmp;
                m++;
                n--;
            }
        }
        return String.valueOf(chars);
    }
}
