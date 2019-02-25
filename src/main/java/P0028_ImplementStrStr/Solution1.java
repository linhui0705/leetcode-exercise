package P0028_ImplementStrStr;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 直接暴力了，没啥好说的。
 * 注意两个问题：1.字串为空串；2.字符串的长度小于字串长度。
 * 看了题解，最快解居然是用indexOf。这样做没意思啊……
 *
 * @author Lin Hui
 * Created on 2019/2/13 14:35
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertEquals(2, strStr("hello", "ll"));
        Assert.assertEquals(-1, strStr("aaaaa", "bba"));
        Assert.assertEquals(13, strStr("aabaabaabaababac", "bac"));
        Assert.assertEquals(4, strStr("aabaac", "ac"));
        Assert.assertEquals(-1, strStr("mississippi", "sippia"));
    }

    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) {
            return 0;
        }
        if (haystack.length() < needle.length()) {
            return -1;
        }
        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(0) && (i + needle.length()) <= haystack.length()) {
                int j = 0;
                while (j < needle.length()) {
                    if (haystack.charAt(i + j) == needle.charAt(j)) {
                        j++;
                    } else {
                        break;
                    }
                }
                if (j == needle.length()) {
                    return i;
                }
            }
        }
        return -1;
    }
}