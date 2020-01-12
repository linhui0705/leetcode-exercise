package P1317_ConvertIntegerToTheSumOfTwoNoZeroIntegers;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 给定一个数n，返回长度为2的数，数组内的和等于n，且数组内的两个数每个数位都不包含0
 *
 * @author Lin Hui
 * Created on 2020-1-12 22:08
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertArrayEquals(new int[]{1, 1}, getNoZeroIntegers(2));
        Assert.assertArrayEquals(new int[]{2, 9}, getNoZeroIntegers(11));
        Assert.assertArrayEquals(new int[]{1, 9999}, getNoZeroIntegers(10000));
        Assert.assertArrayEquals(new int[]{1, 68}, getNoZeroIntegers(69));
        Assert.assertArrayEquals(new int[]{11, 999}, getNoZeroIntegers(1010));

    }

    public int[] getNoZeroIntegers(int n) {
        for (int i = 1; i <= n; i++) {
            if (!(containsZero(i) || containsZero(n - i))) {
                return new int[]{i, n - i};
            }
        }
        return new int[]{0, 0};
    }

    public boolean containsZero(int n) {
        if (n == 0) {
            return true;
        }
        while (n > 0) {
            if (n % 10 == 0) {
                return true;
            } else {
                n /= 10;
            }
        }
        return false;
    }
}
