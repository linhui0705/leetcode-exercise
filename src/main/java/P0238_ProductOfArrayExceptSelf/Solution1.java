package P0238_ProductOfArrayExceptSelf;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 给定一个数组，数组长度大于1，返回一个数组output，output[i]的元素等于除nums[i]以外所有元素的乘积。
 *
 * @author Lin Hui
 * Created on 2020/4/16 15:24:53
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertArrayEquals(new int[]{24, 12, 8, 6}, productExceptSelf(new int[]{1, 2, 3, 4}));
    }

    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        ans[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            ans[i] = nums[i - 1] * ans[i - 1];
        }
        int r = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            ans[i] *= r;
            r *= nums[i];
        }
        return ans;
    }
}
