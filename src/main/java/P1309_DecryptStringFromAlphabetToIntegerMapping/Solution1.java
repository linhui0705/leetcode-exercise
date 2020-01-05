package P1309_DecryptStringFromAlphabetToIntegerMapping;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 根据题意，'1'-'9'转化为'a'-'i'，'10#'-'26#'转化为'j'-'z'
 * 提示Hint很重要，字符串从右向左推能大大简化判断
 *
 * @author Lin Hui
 * Created on 2020-1-5 17:36
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertEquals("jkab", freqAlphabets("10#11#12"));
        Assert.assertEquals("acz", freqAlphabets("1326#"));
        Assert.assertEquals("y", freqAlphabets("25#"));
        Assert.assertEquals("abcdefghijklmnopqrstuvwxyz", freqAlphabets("12345678910#11#12#13#14#15#16#17#18#19#20#21#22#23#24#25#26#"));
    }

    public String freqAlphabets(String s) {
        StringBuilder builder = new StringBuilder();
        char[] ch = s.toCharArray();
        for (int i = ch.length - 1; i >= 0; ) {
            if (ch[i] == '#') {
                builder.append((char) ((ch[i - 2] - '0') * 10 + (ch[i - 1] - '0') + 'a' - 1));
                i = i - 3;
            } else {
                builder.append((char) ((ch[i] - '0') + 'a' - 1));
                i--;
            }
        }
        return builder.reverse().toString();
    }
}
