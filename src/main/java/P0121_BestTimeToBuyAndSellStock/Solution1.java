package P0121_BestTimeToBuyAndSellStock;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 买股票的最佳时机。LeetCode上经典题目。
 * 给定数组为每天股价，买入的机会和卖出的机会各一次，计算交易后最大利润。
 *
 * @author Lin Hui
 * Created on 2021/9/11 11:15:12
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertEquals(5, maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
        Assert.assertEquals(0, maxProfit(new int[]{7, 6, 4, 3, 1}));
    }

    public int maxProfit(int[] prices) {
        int max = 0;
        int buy = Integer.MAX_VALUE;
        for (int price : prices) {
            buy = Math.min(buy, price);
            max = Math.max(max, price - buy);
        }
        return max;
    }
}
