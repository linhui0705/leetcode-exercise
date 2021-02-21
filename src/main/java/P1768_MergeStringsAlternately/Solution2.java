package P1768_MergeStringsAlternately;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: Solution2
 * Description:
 *
 * @author Lin Hui
 * Created on 2021/2/21 15:44:57
 */
public class Solution2 {
    @Test
    public void testCase() {
        Assert.assertEquals("apbqcr", mergeAlternately("abc", "pqr"));
        Assert.assertEquals("apbqrs", mergeAlternately("ab", "pqrs"));
        Assert.assertEquals("apbqcd", mergeAlternately("abcd", "pq"));
    }

    public String mergeAlternately(String word1, String word2) {
        int i = 0;
        int j = 0;
        int k = 0;
        int alen = word1.length();
        int blen = word2.length();
        char[] ch = new char[alen + blen];
        while (i < alen || j < blen) {
            if (i < alen) {
                ch[k++] = word1.charAt(i++);
            }
            if (j < blen) {
                ch[k++] = word2.charAt(j++);
            }
        }
        return new String(ch);
    }
}
