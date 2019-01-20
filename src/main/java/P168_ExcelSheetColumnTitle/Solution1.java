package P168_ExcelSheetColumnTitle;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 *
 * @author Lin Hui
 * Created on 2019-1-20 16:27
 */
public class Solution1 {
    @Test
    public void testCase() {
        //A
        Assert.assertEquals("A", convertToTitle(1));
        //Z
        Assert.assertEquals("Z", convertToTitle(26));
        //AB 26+2
        Assert.assertEquals("AB", convertToTitle(28));
        Assert.assertEquals("ZY", convertToTitle(701));
    }

    public String convertToTitle(int n) {
        int val;
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            val = (n - 1) % 26;
            char c = (char) ('A' + val);
            sb.append(c);
            n = (n - 1) / 26;
        }

        return sb.reverse().toString();
    }
}