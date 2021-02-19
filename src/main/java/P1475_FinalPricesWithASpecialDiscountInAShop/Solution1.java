package P1475_FinalPricesWithASpecialDiscountInAShop;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 给定数组prices，每个元素表示商店商品i的价格。
 * 若i<j且j为最小的索引，并且price[i]>=price[j]，则商品i有优惠，优惠价为price[i]-price[j]。若不符合则无优惠。
 * 求出所有商品的优惠价。
 *
 * @author Lin Hui
 * Created on 2021/2/19 21:13:25
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertArrayEquals(new int[]{4, 2, 4, 2, 3}, finalPrices(new int[]{8, 4, 6, 2, 3}));
        Assert.assertArrayEquals(new int[]{1, 2, 3, 4, 5}, finalPrices(new int[]{1, 2, 3, 4, 5}));
        Assert.assertArrayEquals(new int[]{9, 0, 1, 6}, finalPrices(new int[]{10, 1, 1, 6}));
    }

    public int[] finalPrices(int[] prices) {
        int[] ans = new int[prices.length];
        for (int i = 0; i < prices.length; i++) {
            ans[i] = -1;
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[i] >= prices[j]) {
                    ans[i] = prices[i] - prices[j];
                    break;
                }
            }
            if (ans[i] == -1) {
                ans[i] = prices[i];
            }
        }
        return ans;
    }
}
