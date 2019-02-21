package P231_PowerOfTwo;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 给定一个数，判断是不是2的n次方
 * T(n)=O(logn)
 *
 * @author Lin Hui
 * Created on 2019/2/21 14:56
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertTrue(isPowerOfTwo(1));
        Assert.assertTrue(isPowerOfTwo(16));
        Assert.assertFalse(isPowerOfTwo(218));
    }

    public boolean isPowerOfTwo(int n) {
        if (n == 1) {
            return true;
        }
        long k = 1;
        while (k < n) {
            k = k << 1;
            if (k == n) {
                return true;
            }
        }
        return false;
    }
}
