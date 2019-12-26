package P1160_FindWordsThatCanBeFormedByCharacters;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * Title: Solution1
 * Description:
 * 给定一个字符串数组words和字符串chars，看chars的字符能组成多少个words数组内的单词，返回能组成单词的字符总数。
 *
 * @author Lin Hui
 * Created on 2019-12-26 12:39
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertEquals(6, countCharacters(new String[]{"cat", "bt", "hat", "tree"}, "atach"));
        Assert.assertEquals(10, countCharacters(new String[]{"hello", "world", "leetcode"}, "welldonehoneyr"));
    }

    public int countCharacters(String[] words, String chars) {
        int ans = 0;
        int[] count = new int[26];
        for (char c : chars.toCharArray()) {
            count[c - 'a']++;
        }
        for (String s : words) {
            int[] tc = Arrays.copyOf(count, 26);
            boolean flag = true;
            for (char sc : s.toCharArray()) {
                tc[sc - 'a']--;
                if (tc[sc - 'a'] < 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                ans += s.length();
            }
        }
        return ans;
    }
}
