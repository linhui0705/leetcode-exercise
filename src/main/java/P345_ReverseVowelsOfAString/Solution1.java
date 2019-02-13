package P345_ReverseVowelsOfAString;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 将字符串内的元音字母进行反转
 *
 * @author Lin Hui
 * Created on 2019/2/13 15:37
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertEquals("holle", reverseVowels("hello"));
        Assert.assertEquals("leotcede", reverseVowels("leetcode"));
        Assert.assertEquals("EO", reverseVowels("OE"));
        Assert.assertEquals(".,", reverseVowels(".,"));
        Assert.assertEquals("", reverseVowels(""));
        Assert.assertEquals("e", reverseVowels("e"));
        Assert.assertEquals("t", reverseVowels("t"));
    }

    public String reverseVowels(String s) {
        if (null == s || s.length() == 0) {
            return s;
        }
        int i = 0;
        int j = s.length() - 1;
        char[] chars = s.toCharArray();
        while (i < j) {
            while (i < s.length() && !isVowel(s.charAt(i))) {
                i++;
            }
            while (j >= 0 && !isVowel(s.charAt(j))) {
                j--;
            }
            if (i < j) {
                char tmp = chars[i];
                chars[i] = chars[j];
                chars[j] = tmp;
            }
            i++;
            j--;
        }
        return String.valueOf(chars);
    }

    public boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}
