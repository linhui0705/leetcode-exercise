package P0389_FindTheDifference;

import org.junit.Test;

/**
 * Title: Solution2
 * Description:
 *
 * P.S.:这个方法太TM巧妙了，牛逼
 * 就是计算char的和的差值
 *
 * @author Lin Hui
 * Created on 2018/4/9 12:56
 */
public class Solution2 {
    @Test
    public void testCase() {
        System.out.println(findTheDifference("abcd", "abkcd"));
    }

    public char findTheDifference(String s, String t) {
        char[] ss = s.toCharArray();
        char[] tt = t.toCharArray();

        int c = 0;
        for (int i = 0; i < ss.length; i++) {
            c += (tt[i] - ss[i]);
        }
        return (char) (tt[tt.length - 1] + c);
    }
}
