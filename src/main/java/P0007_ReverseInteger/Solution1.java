package P0007_ReverseInteger;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 将整数转成字符串进行反转
 *
 * @author Lin Hui
 * Created on 2019-1-20 15:37
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertEquals(321, reverse(123));
        Assert.assertEquals(-321, reverse(-123));
        Assert.assertEquals(21, reverse(120));
        reverse(1534236469);
//        Assert.assertEquals(9646324351, );
    }

    public int reverse(int x) {
        boolean isNegative = x < 0;
        x = isNegative ? -x : x;

        String s = String.valueOf(x);
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            sb.append(s.charAt(i));
        }
        int result;
        //反转后的数可能超过Integer精度，按题意直接return 0
        try {
            result = Integer.valueOf(sb.toString());
        } catch (NumberFormatException e) {
            return 0;
        }

        return isNegative ? -result : result;
    }
}
