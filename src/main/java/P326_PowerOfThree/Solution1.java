package P326_PowerOfThree;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 给定一个数，判断是不是3的n次方
 * T(n)=O(logn)
 *
 * @author Lin Hui
 * Created on 2019/2/21 15:03
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertTrue(isPowerOfThree(27));
        Assert.assertFalse(isPowerOfThree(0));
        Assert.assertTrue(isPowerOfThree(9));
        Assert.assertFalse(isPowerOfThree(45));
    }

    public boolean isPowerOfThree(int n) {
        if (n == 1) {
            return true;
        }
        long k = 1;
        while (k < n) {
            k *= 3;
            if (k == n) {
                return true;
            }
        }
        return false;
    }
}
