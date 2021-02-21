package P1768_MergeStringsAlternately;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 给定字符串word1和word2，将两个字符串交替合并成一个新的字符串。
 *
 * @author Lin Hui
 * Created on 2021/2/21 15:38:01
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertEquals("apbqcr", mergeAlternately("abc", "pqr"));
        Assert.assertEquals("apbqrs", mergeAlternately("ab", "pqrs"));
        Assert.assertEquals("apbqcd", mergeAlternately("abcd", "pq"));
    }

    public String mergeAlternately(String word1, String word2) {
        int i = 0;
        int j = 0;
        StringBuilder builder = new StringBuilder();
        while (i < word1.length() && j < word2.length()) {
            builder.append(word1.charAt(i++)).append(word2.charAt(j++));
        }
        if (word1.length() < word2.length()) {
            builder.append(word2.substring(word1.length(), word2.length()));
        } else {
            builder.append(word1.substring(word2.length(), word1.length()));
        }
        return builder.toString();
    }
}
