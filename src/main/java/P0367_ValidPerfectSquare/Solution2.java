package P0367_ValidPerfectSquare;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: Solution2
 * Description:
 * 二分法
 * 有个坑，i*i或end+start这两处有可能会超过Integer.MAX_VALUE，从而导致溢出。
 * 因此i和sq需要定义为long类型。
 *
 * @author Lin Hui
 * Created on 2019-2-8 15:48
 */
public class Solution2 {
    @Test
    public void testCase() {
        Assert.assertTrue(isPerfectSquare(16));
        Assert.assertFalse(isPerfectSquare(14));
        Assert.assertTrue(isPerfectSquare(49));
        Assert.assertFalse(isPerfectSquare(127));
        Assert.assertTrue(isPerfectSquare(100000000));
        Assert.assertTrue(isPerfectSquare(808201));
        Assert.assertTrue(isPerfectSquare(2147395600));
        Assert.assertFalse(isPerfectSquare(0));
        Assert.assertTrue(isPerfectSquare(1));
        Assert.assertFalse(isPerfectSquare(2));
        Assert.assertFalse(isPerfectSquare(3));
        Assert.assertTrue(isPerfectSquare(4));
        Assert.assertTrue(isPerfectSquare(9));

    }

    public boolean isPerfectSquare(int num) {
        return binarySearch(1, num / 2, num) != -1;
    }

    public long binarySearch(long start, long end, int num) {
        if (num == 1) {
            return 1;
        }
        if (start > end) {
            return -1;
        }
        long i = (end + start) / 2;
        long sq = i * i;
        if (sq == num) {
            return i;
        } else if (sq > num) {
            return binarySearch(start, i - 1, num);
        } else {
            return binarySearch(i + 1, end, num);
        }
    }
}
