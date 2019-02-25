package P0859_BuddyStrings;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * Title: Solution1
 * Description:
 * 将字符串两个字符的调换以后，字符串是否相等
 * 两种情况考虑
 * 一种是字符串A和字符串B已经相等，若字符串内有重复字符，任意重复字符串的顺序调换后，两个字符串是相等的
 * 另外一种就是字符串本身不等，某两个字符调换后，再判断A和B字符串是否相等
 *
 * @author Lin Hui
 * Created on 2019-1-23 21:42
 */
public class Solution1 {
    @Test
    public void teseCase() {
        Assert.assertTrue(buddyStrings("ab", "ba"));
        Assert.assertFalse(buddyStrings("ab", "ab"));
        Assert.assertTrue(buddyStrings("aa", "aa"));
        Assert.assertTrue(buddyStrings("aaaaaaabc", "aaaaaaacb"));
        Assert.assertFalse(buddyStrings("", "aa"));
        Assert.assertFalse(buddyStrings("ad", "cb"));
        Assert.assertTrue(buddyStrings("aaaaaaaad", "aaaaaaada"));
        Assert.assertTrue(buddyStrings("daaaaaaaa", "adaaaaaaa"));
        Assert.assertTrue(buddyStrings("a", "a"));
        Assert.assertTrue(buddyStrings("", ""));
    }

    public boolean buddyStrings(String A, String B) {
        if (A.length() != B.length()) {
            return false;
        }
        int count = 0;
        int[] index = new int[3];
        boolean repeatChar = false;
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < A.length() && count <= 2; i++) {
            if (!set.add(A.charAt(i))) {
                repeatChar = true;
            }
            if (A.charAt(i) != B.charAt(i)) {
                index[count++] = i;
            }
        }
        if (count == 0 && repeatChar) {
            return true;
        }
        if (count == 2) {
            char[] charsB = B.toCharArray();
            char tmp = charsB[index[0]];
            charsB[index[0]] = charsB[index[1]];
            charsB[index[1]] = tmp;
            if (A.equals(String.valueOf(charsB))) {
                return true;
            }
        }
        return false;
    }
}
