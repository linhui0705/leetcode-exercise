package P1017_ConvertToBaseNegative2;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 给定一个非负整数N，返回N的负二进制数
 *
 * @author Lin Hui
 * Created on 2019-3-31 20:39
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertEquals("0", baseNeg2(0));
        Assert.assertEquals("110", baseNeg2(2));
        Assert.assertEquals("111", baseNeg2(3));
        Assert.assertEquals("100", baseNeg2(4));
    }

    public String baseNeg2(int N) {
        if (N == 0) {
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        while (N != 0) {
            if (N % -2 != 0) {
                N--;
                sb.append(1);
            } else {
                sb.append(0);
            }
            N /= -2;
        }
        return sb.reverse().toString();
    }
}
