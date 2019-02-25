package P0342_PowerOfFour;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 给定一个数，判断是不是4的n次方
 *
 * @author Lin Hui
 * Created on 2019/2/21 15:19
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertTrue(isPowerOfFour(16));
        Assert.assertFalse(isPowerOfFour(5));
    }

    public boolean isPowerOfFour(int num) {
        if (num == 1) {
            return true;
        }
        String.valueOf(num);
        long k = 1;
        while (k < num) {
            k = k << 2;
            if (k == num) {
                return true;
            }
        }
        return false;
    }
}
