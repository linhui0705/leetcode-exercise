package P0322_CoinChange;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Title: Solution1
 * Description:
 * 硬币兑换问题。经典的动态规划问题。
 * 给定硬币面额集合coins，问最少几枚硬币能凑到金额amount。
 * 前面没有加备忘录，会有重复计算，容易导致超时。借助Map后AC
 * Result: Runtime: 164 ms, faster than 5.05%; Memory Usage: 40.1 MB, less than 26.87%
 *
 * @author Lin Hui
 * Created on 2021/9/11 18:23:35
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertEquals(3, coinChange(new int[]{1, 2, 5}, 11));
        Assert.assertEquals(-1, coinChange(new int[]{2}, 3));
        Assert.assertEquals(0, coinChange(new int[]{1}, 0));
        Assert.assertEquals(1, coinChange(new int[]{1}, 1));
        Assert.assertEquals(2, coinChange(new int[]{1}, 2));
        Assert.assertEquals(20, coinChange(new int[]{1, 2, 5}, 100));
    }

    public int coinChange(int[] coins, int amount) {
        return dp(coins, amount);
    }

    public Map<Integer, Integer> map = new HashMap<>();

    public int dp(int[] coins, int amount) {
        if (amount == 0) {
            return 0;
        }
        if (amount < 0) {
            return -1;
        }
        if (map.containsKey(amount)) {
            return map.get(amount);
        }
        int ans = Integer.MAX_VALUE;
        for (int coin : coins) {
            int subProblem = dp(coins, amount - coin);
            if (subProblem != -1) {
                ans = Math.min(ans, 1 + subProblem);
            }
        }
        map.put(amount, ans == Integer.MAX_VALUE ? -1 : ans);
        return map.get(amount);
    }
}
