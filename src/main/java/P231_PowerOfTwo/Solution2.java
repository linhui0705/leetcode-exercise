package P231_PowerOfTwo;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: Solution2
 * Description:
 * T(n)=O(1)
 *
 * @author Lin Hui
 * Created on 2019/2/21 14:58
 */
public class Solution2 {
    @Test
    public void testCase() {
        Assert.assertTrue(isPowerOfTwo(1));
        Assert.assertTrue(isPowerOfTwo(16));
        Assert.assertFalse(isPowerOfTwo(218));
    }

    public boolean isPowerOfTwo(int n) {
        return n > 0 && Integer.bitCount(n) == 1;
    }
}
