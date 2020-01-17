package P0053_MaximumSubarray;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 最大子序和
 * DP解决，假设第p项至第q-1项的子连续和小于第q项的值，则子连续和可以从第q项开始。按照这种方式来推，可以O(n)找到最大子序和。
 *
 * @author Lin Hui
 * Created on 2020-1-17 14:09
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertEquals(6, maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
        Assert.assertEquals(18, maxSubArray(new int[]{1, -2, 3, 10, -4, 7, 2, -5}));
    }

    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum < nums[i]) {
                sum = nums[i];
            }
            max = Math.max(max, sum);
        }
        return max;
    }
}
