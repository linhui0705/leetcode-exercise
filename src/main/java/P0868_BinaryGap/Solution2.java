package P0868_BinaryGap;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: Solution2
 * Description:
 * 通过位运算计算最长距离
 *
 * @author Lin Hui
 * Created on 2019-2-8 13:50
 */
public class Solution2 {
    @Test
    public void testCase() {
        Assert.assertEquals(2, binaryGap(22));
        Assert.assertEquals(2, binaryGap(5));
        Assert.assertEquals(1, binaryGap(6));
        Assert.assertEquals(0, binaryGap(8));
        Assert.assertEquals(2, binaryGap(13));
    }

    public int binaryGap(int N) {
        int count = 0;
        int max = Integer.MIN_VALUE;
        while ((N & 1) == 0) {
            N = N >> 1;
        }
        while ((N >> 1) > 0) {
            if ((N & 1) == 1) {
                max = Math.max(max, count);
                count = 1;
            } else {
                count++;
            }
            N = N >> 1;
        }
        return Math.max(max, count);
    }
}
