package P367_ValidPerfectSquare;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 暴力，简单粗暴但效率不高
 *
 * @author Lin Hui
 * Created on 2019-2-8 15:40
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertTrue(isPerfectSquare(16));
        Assert.assertFalse(isPerfectSquare(14));
        Assert.assertTrue(isPerfectSquare(49));
        Assert.assertFalse(isPerfectSquare(127));
        Assert.assertTrue(isPerfectSquare(100000000));
        Assert.assertFalse(isPerfectSquare(0));
        Assert.assertFalse(isPerfectSquare(1));
        Assert.assertFalse(isPerfectSquare(2));
        Assert.assertFalse(isPerfectSquare(3));
        Assert.assertTrue(isPerfectSquare(4));
        Assert.assertTrue(isPerfectSquare(9));

    }

    public boolean isPerfectSquare(int num) {
        if (num == 1) {
            return true;
        }
        for (int i = 2; i <= num / 2; i++) {
            if (i * i == num) {
                return true;
            }
        }
        return false;
    }
}
