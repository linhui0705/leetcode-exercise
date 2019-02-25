package P0125_ValidPalindrome;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 排除字母和数字以外的字符，判断回文
 *
 * @author Lin Hui
 * Created on 2019-2-1 23:15
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertTrue(isPalindrome("A man, a plan, a canal: Panama"));
        Assert.assertFalse(isPalindrome("race a car"));
        Assert.assertTrue(isPalindrome("abcba"));
        Assert.assertTrue(isPalindrome("aaa"));
    }

    public boolean isPalindrome(String s) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')) {
                str.append(c);
            } else if (c >= 'A' && c <= 'Z') {
                str.append((char) (c - 'A' + 'a'));
            }
        }

        int i = 0;
        int j = str.length() - 1;
        while (i <= j) {
            if (str.charAt(i++) != str.charAt(j--)) {
                return false;
            }
        }

        return true;
    }
}
