package P0389_FindTheDifference;

import org.junit.Test;

import java.util.Arrays;

/**
 * Title: Solution1
 * Description:
 *
 * @author Lin Hui
 * Created on 2018/4/9 12:49
 */
public class Solution1 {
    @Test
    public void testCase() {
        System.out.println(findTheDifference("abcd", "abkcd"));
    }

    public char findTheDifference(String s, String t) {
        char[] ss = s.toCharArray();
        Arrays.sort(ss);
        char[] tt = t.toCharArray();
        Arrays.sort(tt);

        for (int i = 0; i < s.length(); i++) {
            if (ss[i] != tt[i]) {
                return tt[i];
            }
        }

        return tt[t.length() - 1];
    }
}
