package P0322_CoinChange;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * Title: Solution1
 * Description:
 * 不用递归，使用数组做备忘录，速度上来了。
 * Result: Runtime: 21 ms, faster than 46.45%; Memory Usage: 42 MB, less than 13.84%
 *
 * @author Lin Hui
 * Created on 2021/9/11 18:23:35
 */
public class Solution2 {
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
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, Integer.MAX_VALUE - 1);
        dp[0] = 0;
        for (int coin : coins) {
            for (int i = coin; i <= amount; i++) {
                dp[i] = Math.min(dp[i], 1 + dp[i - coin]);
            }
        }
        return dp[amount] == Integer.MAX_VALUE - 1 ? -1 : dp[amount];
    }
}
