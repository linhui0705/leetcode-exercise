package P0434_NumberOfSegmentsInAString;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 统计字符串中单词的个数，这里的单词指的是连续的非空格字符
 *
 * @author Lin Hui
 * Created on 2019/2/28 14:22
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertEquals(5, countSegments("Hello, my name is John"));
    }

    public int countSegments(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if ((i == 0 || s.charAt(i - 1) == ' ') && s.charAt(i) != ' ') {
                count++;
            }
        }
        return count;
    }
}
