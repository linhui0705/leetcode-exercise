package P0198_HouseRobber;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 打家劫舍。经典动态规划问题。
 * 集合nums元素表示街道房子内的钱财。窃贼在不能盗窃相邻房子的前提下（盗窃相邻的房子会自动联系警察），如何能偷到最多的钱。
 * dp(0) = nums[0]; dp(1) = MAX(nums[0], nums[1]); dp(2) = MAX(nums[1], nums[0] + nums[2])
 * 故动态转换方程为：dp(i) = MAX(dp(i - 2) + nums[i], dp(i-1))
 * Result: Runtime: 0 ms, faster than 100.00%; Memory Usage: 38.5 MB, less than 6.95%
 *
 * @author Lin Hui
 * Created on 2021/9/11 20:35:39
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertEquals(4, rob(new int[]{1, 2, 3, 1}));
        Assert.assertEquals(12, rob(new int[]{2, 7, 9, 3, 1}));
        Assert.assertEquals(200, rob(new int[]{100, 1, 1, 100}));
    }

    public int rob(int[] nums) {
        int[] dp = new int[nums.length + 1];
        int max = dp[0] = nums[0];
        if (nums.length > 1) {
            dp[1] = Math.max(nums[0], nums[1]);
            max = Math.max(dp[0], dp[1]);
        }
        for (int i = 2; i < nums.length; i++) {
            dp[i] = Math.max(dp[i - 2] + nums[i], dp[i - 1]);
            max = Math.max(max, dp[i]);
        }
        return max;
    }
}
