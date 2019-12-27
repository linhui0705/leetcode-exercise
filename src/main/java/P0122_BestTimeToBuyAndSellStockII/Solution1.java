package P0122_BestTimeToBuyAndSellStockII;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 数组的第i个元素为第i天的股价，股票不能接连购买，如何购买股票能获得最大利润？
 * 典型的贪心算法，只需计算连续两天内股票涨价的差额的和即可。
 *
 * @author Lin Hui
 * Created on 2019-12-27 22:13
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertEquals(7, maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
        Assert.assertEquals(4, maxProfit(new int[]{1, 2, 3, 4, 5}));
        Assert.assertEquals(0, maxProfit(new int[]{7, 6, 4, 3, 1}));
        Assert.assertEquals(2, maxProfit(new int[]{2, 1, 2, 0, 1}));
    }

    public int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i - 1] < prices[i]) {
                profit += prices[i] - prices[i - 1];
            }
        }
        return profit;
    }
}
