package P441_ArrangingCoins;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 递推迭代
 * total>=0，是防止total累加超过Integer.MAX_VALUE导致溢出变成负数
 *
 * @author Lin Hui
 * Created on 2019/2/1 11:43
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertEquals(2, arrangeCoins(5));
        Assert.assertEquals(3, arrangeCoins(8));
        Assert.assertEquals(3, arrangeCoins(6));

        Assert.assertEquals(0, arrangeCoins(0));
        Assert.assertEquals(1, arrangeCoins(1));
        Assert.assertEquals(1, arrangeCoins(2));
        Assert.assertEquals(2, arrangeCoins(3));
        Assert.assertEquals(2, arrangeCoins(4));
        Assert.assertEquals(2, arrangeCoins(5));
        Assert.assertEquals(3, arrangeCoins(6));
        Assert.assertEquals(3, arrangeCoins(7));
        Assert.assertEquals(3, arrangeCoins(8));
        Assert.assertEquals(3, arrangeCoins(9));
        Assert.assertEquals(4, arrangeCoins(10));
        Assert.assertEquals(4, arrangeCoins(11));
        Assert.assertEquals(4, arrangeCoins(12));
        Assert.assertEquals(4, arrangeCoins(13));
        Assert.assertEquals(4, arrangeCoins(14));
        Assert.assertEquals(5, arrangeCoins(15));
        Assert.assertEquals(5, arrangeCoins(16));
        Assert.assertEquals(5, arrangeCoins(17));
        Assert.assertEquals(5, arrangeCoins(18));
        Assert.assertEquals(5, arrangeCoins(19));
        Assert.assertEquals(5, arrangeCoins(20));
        Assert.assertEquals(65535, arrangeCoins(Integer.MAX_VALUE));
    }

    public int arrangeCoins(int n) {
        int total = 0;
        int count = 0;
        while (total <= n && total >= 0) {
            total += ++count;
        }
        return count - 1;
    }
}
