package P0263_UglyNumber;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 判断丑数
 * 需要注意的地方是，要判断0不是丑数
 *
 * @author Lin Hui
 * Created on 2019-1-30 22:14
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertTrue(isUgly(6));
        Assert.assertTrue(isUgly(8));
        Assert.assertFalse(isUgly(14));
    }

    public boolean isUgly(int num) {
        if (num == 0) {
            return false;
        }
        while (num % 2 == 0) {
            num /= 2;
        }
        while (num % 3 == 0) {
            num /= 3;
        }
        while (num % 5 == 0) {
            num /= 5;
        }
        return num == 1;
    }
}
