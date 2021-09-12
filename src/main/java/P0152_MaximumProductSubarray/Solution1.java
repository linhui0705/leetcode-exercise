package P0152_MaximumProductSubarray;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 最大乘积子数组
 * dp[0]=nums[0]
 * dp[1]=Math.max(dp[0]*nums[1],nums[1])
 * dp[i]=Math.max(dp[i-1]*nums[i],nums[i])
 * 但集合内有负数的情况也要考虑。因此还需要设一个数组dpn来记录最小乘积（有可能负负得正，反而成为最大乘积子数组）。
 *
 * @author Lin Hui
 * Created on 2021/9/12 09:29:22
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertEquals(6, maxProduct(new int[]{2, 3, -2, 4}));
        Assert.assertEquals(0, maxProduct(new int[]{-2, 0, -1}));
        Assert.assertEquals(6, maxProduct(new int[]{-1, -2, -3}));
        Assert.assertEquals(24, maxProduct(new int[]{-1, -2, -3, -4}));
        Assert.assertEquals(120, maxProduct(new int[]{1, -2, 3, -4, 5}));
        Assert.assertEquals(120, maxProduct(new int[]{-1, 2, -3, 4, -5}));
        Assert.assertEquals(2, maxProduct(new int[]{0, 2}));
    }

    public int maxProduct(int[] nums) {
        int max;
        int[] dpn = new int[nums.length + 1];
        int[] dp = new int[nums.length + 1];
        max = dp[0] = dpn[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            dp[i] = Math.max(dp[i - 1] * nums[i], dpn[i - 1] * nums[i]);
            dp[i] = Math.max(dp[i], nums[i]);
            dpn[i] = Math.min(dp[i - 1] * nums[i], dpn[i - 1] * nums[i]);
            dpn[i] = Math.min(dpn[i], nums[i]);
            max = Math.max(max, dp[i]);
        }
        return max;
    }
}
