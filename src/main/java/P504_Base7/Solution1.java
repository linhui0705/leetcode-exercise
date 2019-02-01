package P504_Base7;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 十进制数转换为7进制数，返回字符串类型
 *
 * @author Lin Hui
 * Created on 2019/2/1 10:55
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertEquals("203", convertToBase7(101));
        Assert.assertEquals("-10", convertToBase7(-7));
        Assert.assertEquals("0", convertToBase7(0));
        Assert.assertEquals("1", convertToBase7(1));
        Assert.assertEquals("-1", convertToBase7(-1));
        Assert.assertEquals("11", convertToBase7(8));
        Assert.assertEquals("-11", convertToBase7(-8));
    }

    public String convertToBase7(int num) {
        if (num == 0) {
            return "0";
        }

        boolean negative = false;
        if (num < 0) {
            negative = true;
            num = -num;
        }

        StringBuilder sb = new StringBuilder();
        while (num > 0) {
            sb.append(num % 7);
            num /= 7;
        }
        if (negative) {
            sb.append("-");
        }
        return sb.reverse().toString();
    }
}
