package P953_VerifyingAnAlienDictionary;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 之前读题读到懵逼了。今天不止咋地突然大彻大悟……
 * 题意就是根据提供的字典编纂，判断字符串数组是否依照排序
 *
 * @author Lin Hui
 * Created on 2019/2/13 17:05
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertTrue(isAlienSorted(new String[]{"hello", "leetcode"}, "hlabcdefgijkmnopqrstuvwxyz"));
        Assert.assertFalse(isAlienSorted(new String[]{"word", "world", "row"}, "worldabcefghijkmnpqstuvxyz"));
        Assert.assertFalse(isAlienSorted(new String[]{"apple", "app"}, "abcdefghijklmnopqrstuvwxyz"));
        Assert.assertFalse(isAlienSorted(new String[]{"aa", "a"}, "abcdefghijklmnopqrstuvwxyz"));
        Assert.assertTrue(isAlienSorted(new String[]{"kuvp", "q"}, "ngxlkthsjuoqcpavbfdermiywz"));
    }

    public boolean isAlienSorted(String[] words, String order) {
        if (words.length <= 1) {
            return true;
        }

        int[] index = new int[26];
        for (int i = 0; i < order.length(); i++) {
            char c = order.charAt(i);
            index[c - 'a'] = i;
        }

        for (int i = 0; i < words.length - 1; i++) {
            String sa = words[i];
            String sb = words[i + 1];
            int j = 0;
            for (; j < Math.min(sa.length(), sb.length()); j++) {
                if (index[sa.charAt(j) - 'a'] > index[sb.charAt(j) - 'a']) {
                    return false;
                } else if (index[sa.charAt(j) - 'a'] < index[sb.charAt(j) - 'a']) {
                    break;
                }
            }
            if (j > 0 && sa.length() > sb.length()) {
                return false;
            }
        }

        return true;
    }
}
