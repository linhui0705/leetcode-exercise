package P868_BinaryGap;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 将Integer整数转为二进制String类型
 *
 * @author Lin Hui
 * Created on 2019-2-8 13:31
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertEquals(2, binaryGap(22));
        Assert.assertEquals(2, binaryGap(5));
        Assert.assertEquals(1, binaryGap(6));
        Assert.assertEquals(0, binaryGap(8));
    }

    public int binaryGap(int N) {
        String s = Integer.toBinaryString(N);
        int count = 0;
        int max = Integer.MIN_VALUE;
        for (char c : s.toCharArray()) {
            if (c == '1') {
                max = Math.max(max, count);
                count = 1;
            } else {
                count++;
            }
        }
        return max;
    }
}
