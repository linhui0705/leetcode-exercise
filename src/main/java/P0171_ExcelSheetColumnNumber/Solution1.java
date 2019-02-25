package P0171_ExcelSheetColumnNumber;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 *
 * @author Lin Hui
 * Created on 2019/1/21 17:33
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertEquals(1, titleToNumber("A"));
        Assert.assertEquals(28, titleToNumber("AB"));
        Assert.assertEquals(701, titleToNumber("ZY"));
    }

    public int titleToNumber(String s) {
        int result = 0;
        char[] arrays = s.toCharArray();

        for (int i = 0; i < s.length(); i++) {
            int k = arrays[i] - 'A' + 1;
            result += k * Math.pow(26, s.length() - 1 - i);
        }

        return result;
    }
}
