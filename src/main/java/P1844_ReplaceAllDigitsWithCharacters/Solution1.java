package P1844_ReplaceAllDigitsWithCharacters;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 给定一个索引为0的字符串s，该字符串的偶数索引中包含小写英文字母，奇数索引中包含数字。
 * 现有一个函数shift(c,x)，c为字母，x为数字，函数返回字母参数c偏移x个顺序后的字母。将字符串中的数字通过函数偏移转换。
 *
 * @author Lin Hui
 * Created on 2021/5/14 21:45:11
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertEquals("abcdef", replaceDigits("a1c1e1"));
        Assert.assertEquals("abbdcfdhe", replaceDigits("a1b2c3d4e"));
    }

    public String replaceDigits(String s) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'z') {
                builder.append(c);
            } else if (c >= '0' && c <= '9') {
                builder.append((char) ((int) s.charAt(i - 1) + (c - '0')));
            }
        }
        return builder.toString();
    }
}
