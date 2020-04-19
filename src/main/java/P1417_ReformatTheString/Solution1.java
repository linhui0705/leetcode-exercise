package P1417_ReformatTheString;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 给定一个字符串，包含数字和字母，将数字和字母交替后输出。若字符串为纯数字或纯字母，返回空字符串。
 * 字符串"a0b1c2"，答案可为"0a1b2c", "a0b1c2", "0a1b2c", "0c2a1b"
 *
 * @author Lin Hui
 * Created on 2020/4/19 12:12:43
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertEquals("a0b1c2", reformat("a0b1c2"));
        Assert.assertEquals("", reformat("leetcode"));
        Assert.assertEquals("", reformat("1229857369"));
        Assert.assertEquals("c2o0v1i9d", reformat("covid2019"));
        Assert.assertEquals("1a2b3", reformat("ab123"));
    }

    public String reformat(String s) {
        StringBuilder nBuilder = new StringBuilder();
        StringBuilder aBuilder = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c >= '0' && c <= '9') {
                nBuilder.append(c);
            }
            if (c >= 'a' && c <= 'z') {
                aBuilder.append(c);
            }
        }
        if (s.length() == 1) {
            return s;
        }
        if (nBuilder.length() == 0 || aBuilder.length() == 0) {
            return "";
        }
        int i = 0;
        StringBuilder builder = new StringBuilder();
        if (nBuilder.length() > aBuilder.length()) {
            while (i < aBuilder.length()) {
                builder.append(nBuilder.charAt(i));
                builder.append(aBuilder.charAt(i));
                i++;
            }
            if (i < nBuilder.length()) {
                builder.append(nBuilder.charAt(i));
            }
        } else {
            while (i < nBuilder.length()) {
                builder.append(aBuilder.charAt(i));
                builder.append(nBuilder.charAt(i));
                i++;
            }
            if (i < aBuilder.length()) {
                builder.append(aBuilder.charAt(i));
            }
        }
        return builder.toString();
    }
}
